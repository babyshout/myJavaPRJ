package book.forbeginner.ch9;

public class Ex09_06 {
    public static void main(String[] args) {
        String str = "     한글 ABCD efgh     ";
        
        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("원 문자열 ==> [" + str.toUpperCase() + "]");
        System.out.println("원 문자열 ==> [" + str.toLowerCase() + "]");
        System.out.println("원 문자열 ==> [" + str.trim() + "]");
    }
}
