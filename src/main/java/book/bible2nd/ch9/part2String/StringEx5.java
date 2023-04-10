package book.bible2nd.ch9.part2String;

public class StringEx5 {
    static String s1;
    static String s2 = "";
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            s1 += i; // s = s + i;
            s2 += i;
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
