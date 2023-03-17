package exam.back_exam;
import java.util.Scanner;
public class Exam27866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int index = s.nextInt() - 1;

        System.out.println(str.charAt(index));
    }
}
