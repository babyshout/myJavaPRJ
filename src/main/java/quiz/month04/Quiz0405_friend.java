package quiz.month04;

public class Quiz0405_friend {
    public static void main(String[] args) {
        int a, b;
        
        for (a = 1, b = 2; b < 10;a++) {
            System.out.printf("%d * %d = %d \n", b, a, b * a);
            if ( a == 9 ) {
                b++;
                a = 0;
                System.out.printf("\n");
            }
        }
    }
}
