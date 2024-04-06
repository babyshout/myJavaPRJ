package tcpschool.thread.thread02;

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());	// 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread02 {
    public static void main(String[] args){
        Thread thread0 = new Thread(new ThreadWithRunnable());
        Thread thread1 = new Thread(new ThreadWithRunnable());

        thread1.setPriority(10);	// Thread-1의 우선순위를 10으로 변경함.

        thread0.start();			// Thread-0 실행
        thread1.start();			// Thread-1 실행

        System.out.println(thread0.getPriority());
        System.out.println(thread1.getPriority());
    }
}