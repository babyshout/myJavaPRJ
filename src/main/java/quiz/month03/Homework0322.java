package quiz.month03;

import java.util.Scanner;

public class Homework0322 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.printf("값을 입력해 주세요 : ");
        input = sc.nextInt();

        if (input % 3 == 0)
            System.out.printf("3의 배수입니다.\n");

        int test = 10;
        System.out.printf("%d\n", test);
        test = ++test / test++;


        System.out.printf("%d\n", test);
        System.out.printf("%d\n", ++test);

        System.out.println("" + 1 + 2 + 3 + (1 + 2 + 3));

        String str1 = " ";

        boolean bool = str1 == " ";

        System.out.println(bool);

    }
}
