package book.forbeginner.ch5;

import java.util.Scanner;

public class Ex05_08_Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.printf("점수를 입력하세요 : ");
        a = sc.nextInt();

        if (a >= 90) {
            System.out.printf("A");
        } else if (a >= 80) {
            System.out.printf("B");
        } else if (a >= 70) {
            System.out.printf("C");
        } else if (a >= 60) {
            System.out.printf("D");
        } else
            System.out.printf("F");


        System.out.printf(" 학점 입니다. \n");
    }
}
