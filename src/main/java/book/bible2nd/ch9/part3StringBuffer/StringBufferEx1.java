package book.bible2nd.ch9.part3StringBuffer;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        
        if (sb1 == sb2) {
            System.out.println("sb1 == sb2 ? true");
        } else {
            System.out.println("sb1 == sb2 ? false");
        }
        
        if (sb1.equals(sb2)) {
            System.out.println("sb1.equals(sb2) ? true");
        } else {
            System.out.println("sb1.equals(sb2) ? false");
        }
        
        //Stringbuffer의 내용을 String으로 변환한다.
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        
        
        if (s1.equals(s2)) {
            System.out.println("s.equals(s2) ? true");
        } else {
            System.out.println("s.equals(s2) ? false");
        }
        
        
    }
}
