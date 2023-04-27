package exam.back_exam;

import java.util.Scanner;

public class Exam2903 {
    public static void main(String[] args) {
        int a = 2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a += a - 1;
        }
        System.out.printf("%d", a * a);
    }
}
