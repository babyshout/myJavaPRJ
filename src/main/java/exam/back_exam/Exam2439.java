package exam.back_exam;
import java.util.Scanner;
public class Exam2439 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();

//        for (int i = 0; i < a; i++) {
//
//            for (int j = i; j > a; j--) {
//
//                int k = i;
//
//                if (i >= j) {
//                    System.out.printf("*");
//                } else {
//                    System.out.printf(" ");
//                }
//            }
//            System.out.printf("\n");
//        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i+1 ; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        return;
    }
}
