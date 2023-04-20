package book.bible2nd.ch8Exceptions.part1;

public class ExceptionEx10 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (Exception e) { //모든 예외는 Exception클래스의 자손이기 때문에 RuntimeException 대신 Exception으로 처리 가능
            System.out.println(5);
        }   //try-catch의 끝
        System.out.println(6);
    }   //main메서드의 끝
}
