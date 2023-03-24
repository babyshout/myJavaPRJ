package exam.back_exam;

import java.util.Scanner;

public class Exam1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] test = str.split(" ");
        System.out.println(test.length);

        boolean isWordStart = false;

        int wordCount = 0;

        if (str.charAt(0) != ' ')
            wordCount++;

        for (int i = 1; i < str.length(); i++) {
            if (!isWordStart && str.charAt(i) != ' '){
                isWordStart = true;
//                str.charAt();
            }
//            if(isWordStart && str.charAt(i-1) == ' ' && str.charAt(i) != ' ')
            if(isWordStart && str.charAt(i-1) == ' ' && str.charAt(i) != ' '){
                wordCount++;
                isWordStart = false;
            }
        }
        System.out.println(wordCount);
    }
}
