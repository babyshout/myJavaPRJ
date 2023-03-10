package exam.back_exam;

import java.util.Scanner;

public class Exam2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputYear = sc.nextInt();


        if ( (inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0 ) {

            System.out.println("1");
        } else
            System.out.println("0");



    }

}
