package book.bible2nd.ch8Exceptions.part1;

import java.io.*;

public class ExceptionEx13 {
    public static void main(String[] args) {
        PrintStream ps = null;

        try {
            ps = new PrintStream("error.log");

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(0/0);    //예외발생!!
            System.out.println(4);
        } catch (Exception ae) {
            ae.printStackTrace(ps);
            ps.println("예외메시지 : " + ae.getMessage());
        }   //try-catch end
        System.out.println(6);
    }   //main end
}
