package book.forbeginner.ch6;

public class Ex06_08 {
    public static void main(String args[]) {
//        int hap = 0;
        int hap;
        int i;

        for (i = 0, hap = 0; i <= 10; i++) {
            hap += i;
        }

        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
