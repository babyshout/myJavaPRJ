package book.forbeginner.ch8;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        int a, b, c, d;

        int arr[] = new int[4];

        Scanner sc = new Scanner(System.in);

//        System.out.println("a");
//        arr[0] = sc.nextInt();
//        System.out.println("b");
//        arr[1] = sc.nextInt();
//        System.out.println("c");
//        arr[2] = sc.nextInt();
//        System.out.println("d");
//        arr[3] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1);
            arr[i] = sc.nextInt();
        }

        int length = arr.length;





        System.out.println(length);

        int result = arr[0] + arr[1] + arr[2] + arr[3];

        System.out.println("a+b+c+d=" + result);

    }
}
