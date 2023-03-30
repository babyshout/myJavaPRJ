package quiz;

import java.util.Scanner;

class Quiz0329 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.printf("입력 값 : ");

        input = sc.nextInt();

        if (input % 2 == 0 || input % 3 == 0) {

            if (input % 2 == 0 && input % 3 == 0)
                System.out.println("출력 값 : 2의 배수와 3의 배수를 만족합니다.");
            else if (input % 2 == 0)
                System.out.println("출력 값 : 2의 배수입니다.");
            else
                System.out.println("출력 값 : 3의 배수입니다.");

        }

    }
}