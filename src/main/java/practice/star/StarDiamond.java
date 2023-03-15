package practice.star;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input * 2 + 1; i++) {   //input * 2 == 세로 길이
            if (i < input) {    //
                for (int j = input; j > i; j--) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.printf("*");
                }
            } else {
                for (int j = 0; j < i - input; j++) {
                    System.out.printf(" ");
                }
                for (int j = (input * 2) + 1; j > (i * 2) - (input * 2); j--) {
                    System.out.printf("*");
                }
            }
            System.out.printf("\n");
        }
    }
}
