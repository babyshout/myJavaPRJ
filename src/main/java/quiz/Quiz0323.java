package quiz;

import java.util.Scanner;

public class Quiz0323 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("입력값 : ");

        int input = sc.nextInt();

        System.out.printf("출력결과\n");

        if (input % 3 == 0 || input % 5 == 0) {

            if (input % 3 == 0 && input % 5 == 0)
                System.out.printf("\"3의 배수와 5의 배수를 둘다 만족합니다.\"");
            else if (input % 3 == 0)
                System.out.printf("\"3의 배수입니다.\"");
            else
                System.out.printf("\"5의 배수입니다.\"");

        }
    }
}
