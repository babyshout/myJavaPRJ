package quiz.mon05;

import java.util.HashSet;
import java.util.Scanner;

public class Quiz0503HAN {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            set.add(sc.nextInt());
        }
        
        System.out.println(set);
    }
}
