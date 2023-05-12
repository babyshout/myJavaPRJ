package exam.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class InversionChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] inversionCase = input.toCharArray();
        int distance = 'A' - 'a';
        System.out.println(distance);
        for (int i = 0; i < input.length(); i++) {
            if('A' <= inversionCase[i] && inversionCase[i] <= 'Z'){
                inversionCase[i] -= distance;
            } else if('a' <= inversionCase[i] && inversionCase[i] <= 'z'){
                inversionCase[i] += distance;
            }
        }
        
        System.out.println(sc.nextLine());
        
        System.out.println(Arrays.toString(inversionCase));
    }
}
