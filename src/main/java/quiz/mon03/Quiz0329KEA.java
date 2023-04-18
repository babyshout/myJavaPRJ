package quiz.mon03;

import java.util.Scanner;

public class Quiz0329KEA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.printf("입력 값 : ");
        num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0)
            System.out.println("2의 배수와 3의 배수를 모두 만족합니다.");
        else if (num % 2 == 0)
            System.out.println("2의 배수 입니다.");
        else if (num % 3 == 0)
            System.out.println("3의 배수 입니다.");

    }
}
