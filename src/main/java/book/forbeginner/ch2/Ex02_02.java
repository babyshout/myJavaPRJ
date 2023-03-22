package book.forbeginner.ch2;

import java.util.Scanner;
public class Ex02_02 {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        int a, b;
        int result;

        System.out.println("input go");

        Scanner s = new Scanner(System.in);

        System.out.println("first int");
        a = s.nextInt();

        System.out.println("second int");
        b = s.nextInt();

        result = a + b;
        System.out.println(a + "+" + b + "=" + result);
        System.out.println("a = "+ a + "   " + "b = " + b + "    " + result);

        result = a - b;
        //System.out.println(a + "+" + b + "=" + a-b);
        System.out.println("a = "+ a + "   " + "b = " + b + "    " + result);

        result = a * b;
        System.out.println(a + "+" + b + "=" + a*b);
        System.out.println("a = "+ a + "   " + "b = " + b + "    " + result);

        result = a / b;
        System.out.println(a + "+" + b + "=" + a/b);
        System.out.println("a = "+ a + "   " + "b = " + b + "    " + result);

        result = a % b;
        System.out.println(a + "+" + b + "=" + a%b);
        System.out.println("a = "+ a + "   " + "b = " + b + "    " + result);

        return;
    }
}
