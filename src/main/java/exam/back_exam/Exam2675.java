package exam.back_exam;

import java.util.Scanner;

public class Exam2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        int testCase = sc.nextInt();

        int repeat;

        String newStringP = "";

        for (int i = 0; i < testCase; i++) {
            repeat = sc.nextInt();

            str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    newStringP += str.charAt(j);
                }
            }

            System.out.println(newStringP);

            newStringP = "";

        }

    }
}
