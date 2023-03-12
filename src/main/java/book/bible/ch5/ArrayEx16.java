package book.bible.ch5;
import javax.swing.*;


public class ArrayEx16 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;
        String temp = "";
        int count = 0;

        do {
            count++;
            temp = JOptionPane.showInputDialog("1~100 integer input plz." + "   -1 to exit");

            if(temp == null || temp.equals("-1")) break;

            System.out.println("input = " + temp);

            input = Integer.parseInt(temp);

            if(answer > input) {
                System.out.println("input lager Integer.");
            } else if (answer < input) {
                System.out.println("input smaller Integer");
            } else {
                System.out.println("correct.");
                System.out.println("count is " + count);
                break;
            }
        } while(true);




    }

}
