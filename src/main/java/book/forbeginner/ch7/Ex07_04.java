package book.forbeginner.ch7;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char ch;
        
        while (true) {
            System.out.printf("계산할 첫번째 수를 입력 : ");
            a = sc.nextInt();
            System.out.printf("계산할 두번째 수를 입력 : ");
            b = sc.nextInt();
            System.out.printf("계산할 연산자를 입력하세요 : ");
            try {
                ch = (char) System.in.read();
            } catch(IOException ioe){
                ch = 0;
            }
            switch (ch) {
                case '+':
                    System.out.printf("%d + %d = %d 입니다 \n", a, b, a + b);
                    break;
                case '-':
                    System.out.printf("%d - %d = %d 입니다 \n", a, b, a - b);
                    break;
                case '*':
                    System.out.printf("%d * %d = %d 입니다 \n", a, b, a * b);
                    break;
                case '/':
                    System.out.printf("%d / %d = %f 입니다 \n", a, b, a / (float) b);
                    break;
                case '%':
                    System.out.printf("%d %% %d = %d 입니다 \n", a, b, a % b);
                    break;
                default:
                    System.out.printf("연산자를 잘못 입력했습니다. \n");
                
            }
        }
    }
}
