package exam.back_exam;

import java.util.Scanner;

public class Exam10811 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int time = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }



        int a, b, tmp;
        for (int i = 0; i < time; i++) {
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;

            for (int j = 0; j <= (b - a) / 2; j++) {
                tmp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = tmp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\n");

    }
}
