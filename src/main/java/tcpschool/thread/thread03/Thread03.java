package tcpschool.thread.thread03;

class ThreadWithRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(10);	// 0.01초간 스레드를 멈춤.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread03 {
    public static void main(String[] args){
        Thread thread0 = new Thread(new ThreadWithRunnable());
        thread0.start();	// Thread-0 실행
        System.out.println(thread0.getThreadGroup());

        ThreadGroup group = new ThreadGroup("myThread");	// myThread라는 스레드 그룹 생성함.
        group.setMaxPriority(7);	// 해당 스레드 그룹의 최대 우선순위를 7로 설정함.

        // 스레드를 생성할 때 포함될 스레드 그룹을 전달할 수 있음.
        Thread thread1 = new Thread(group, new ThreadWithRunnable());
        thread1.start();	// Thread-1 실행
        System.out.println(thread1.getThreadGroup());
    }
}