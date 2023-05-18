package quiz.month04.prepareFirstExam;

import java.util.Scanner;

public class PrepareEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("\n12345('='need)");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println("\n12345space('='need)");
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }

        System.out.println("\n54321");
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println("\n54321spaces");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < input - i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println("\n123454321");
        for (int i = 0; i < input * 2; i++) {
            if (i < input + 1)
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }
            else {
                for (int j = 0; j < (input * 2) - i; j++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }

        System.out.println("\n123454321spaces");
        for (int i = 0; i < input * 2 + 1; i++) {
            if (i < input + 1) {
                for (int j = 0; j < input - i; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }
            } else {
                for (int j = 0; j < i - input; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < input * 2 - i; j++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }

        System.out.println("\ndiamond");
        for (int i = 0; i < input * 2 + 1; i++) {
            if (i < input + 1) {
                for (int j = 0; j < input - i; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.printf("*");
                }
            } else {
                for (int j = 0; j < i - input; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < ((input * 2) - i) * 2 - 1; j++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
