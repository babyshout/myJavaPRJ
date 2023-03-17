package exam.back_exam;

import java.util.Scanner;

public class Exam9086 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int iInput = sc.nextInt();
//
//        String str[] = new String[iInput];
//        for (int i = 0; i < iInput; i++) {
//            str[i] = sc.next();
//        }
//        for (int i = 0; i < iInput; i++) {
//            System.out.printf("%c%c\n",str[i].charAt(0), str[i].charAt(str[i].length() - 1));
//        }
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        String str = "";

        for (int j = 0; j < i; j++) {
            //System.out.println(arr);
            str = s.next();

            System.out.printf("%c%c\n",str.charAt(0), str.charAt(str.length() - 1));
        }
    }
}
