package book.forbeginner.ch8;

import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] aa = new int[4];
        int hap;
        
        for (int i = 0; i < 4; i++) {
            
            System.out.printf("%d번째 숫자를 입력하세요.", i + 1);
            aa[i] = sc.nextInt();
        }

//        System.out.printf("2번째 숫자를 입력하세요.");
//        aa[1] = sc.nextInt();
//        System.out.printf("3번째 숫자를 입력하세요.");
//        aa[2] = sc.nextInt();
//        System.out.printf("4번째 숫자를 입력하세요.");
//        aa[3] = sc.nextInt();
        
        hap = aa[0] + aa[1] + aa[2] + aa[3];
        
        System.out.printf("합계 ==> %d \n", hap);
    }
}
