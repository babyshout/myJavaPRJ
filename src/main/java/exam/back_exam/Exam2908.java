package exam.back_exam;

import java.util.Scanner;

public class Exam2908 extends Object{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        String aStr = a + "", bStr = b + "";

        char[] aChar = aStr.toCharArray(), bChar = bStr.toCharArray();

//        System.out.printf("%c%c%c", aChar[0], aChar[1], aChar[2]);
//        System.out.println(aChar);

        char temp;
        temp = aChar[0];
        aChar[0] = aChar[2];
        aChar[2] = temp;

        temp = bChar[0];
        bChar[0] = bChar[2];
        bChar[2] = temp;

        aStr = "" + aChar[0] + aChar[1] + aChar[2];
        bStr = "" + bChar[0] + bChar[1] + bChar[2];

        a = Integer.parseInt(aStr);

        b = Integer.parseInt(bStr);

        if (a >= b) {
            System.out.printf("%d", a);
        } else {
            System.out.printf("%d", b);
        }

    }
}
