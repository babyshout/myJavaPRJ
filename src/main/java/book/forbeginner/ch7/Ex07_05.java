package book.forbeginner.ch7;

public class Ex07_05 {
    public static void main(String[] args) {
        int a = 100;
        
        while (a == 200) {
            System.out.printf("while문 내부에 들어 왔습니다. \n");
        }
        
        do {
            System.out.printf("do-while문 내부에 들어 왔습니다 \n");
        } while (a == 200);
    }
}
