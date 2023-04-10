package book.bible2nd.ch8.part1;

public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            System.out.println(5);
        } // try-catch의 끝
    } //main의 끝
}
