package exam.back_exam;

import java.util.Scanner;

public class Exam10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        
        String strInput = sc.nextLine();
        
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        
        int strLength = strInput.length();
        
        int myIndex;
        
        for (int i = 0; i < strLength; i++) {
            
            myIndex = strInput.charAt(i) - 'a';
            
            if (arr[myIndex] == -1)
                arr[myIndex] = i;
            
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.printf("%d ", arr[i]);
        }
        
    }
}
