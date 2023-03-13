package book.forbeginner;

import java.util.Scanner;
public class Ex02_exam_01 {

    public class asdf {

    }

    public static void add() {

        int a, b, c, d;
        int result;

        Scanner s = new Scanner(System.in);

        System.out.println("add add add add");

        System.out.println("first int go");
        a = s.nextInt();

        System.out.println("2 int go");
        b = s.nextInt();

        System.out.println("3 int go");
        c = s.nextInt();

        System.out.println("4 int go");
        d = s.nextInt();

        result = a + b + c + d;

        System.out.println(a + " + " + b + " + " + c + " + " + d + " + " + result);

        return;
    }

    public static void choose() {

        int a, b;
        int select;
        int result;

        Scanner s = new Scanner(System.in);

        System.out.println("mini calc");

        System.out.println("first int go");
        a = s.nextInt();

        System.out.println("[1]+ [2]- [3]* [4]/ [5]%");
        select = s.nextInt();

        System.out.println("second int go");
        b = s.nextInt();

        if(select == 1) {
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        } else if (select == 2) {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);

        } else if (select == 3) {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);

        } else if (select == 4) {
            float aa, bb;
            float result_flo;
            aa = a;
            bb = b;
            result_flo = aa/bb;
            System.out.println(a + "/" + b + "=" + result_flo);

        } else if (select == 5) {
            result = a % b;
            System.out.println(a + "%" + b + "=" + result);

        }


        return;
    }

    public static void choose_div() {

        int a, b;
        int select;
        int result;

        Scanner s = new Scanner(System.in);

        System.out.println("mini calc");

        System.out.println("first int go");
        a = s.nextInt();

        System.out.println("[1]+ [2]- [3]* [4]/ [5]%");
        select = s.nextInt();

        System.out.println("second int go");
        b = s.nextInt();

        if(select == 1) {
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        } else if (select == 2) {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);

        } else if (select == 3) {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);

        } else if (select == 4) {
            if (b == 0) {
                System.out.println("second 0 no");
            } else {
                float aa, bb;
                float result_flo;
                aa = a;
                bb = b;
                result_flo = aa/bb;
                System.out.println(a + "/" + b + "=" + result_flo);
            }

        } else if (select == 5) {
            result = a % b;
            System.out.println(a + "%" + b + "=" + result);

        }


        return;
    }

    public static void main(String[] args) {

        add();

        choose();

        choose_div();


        return;
    }
}
