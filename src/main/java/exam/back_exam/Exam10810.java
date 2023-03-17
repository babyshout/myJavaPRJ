package exam.back_exam;
import java.util.Scanner;
public class Exam10810 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int [s.nextInt()];
        int m = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int j = 0; j < m; j++) {
            int a = s.nextInt() - 1;
            int b = s.nextInt() - 1;
            int c = s.nextInt();

            for (int k = a; k <=b; k++) {
                arr[k] = c;
            }
        }
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}
