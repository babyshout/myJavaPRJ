package book.forbeginner.ch8;

import java.util.Arrays;

public class Ex08_05 {
    public static void main(String[] args) {

//        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int[] a_array = new int[100];
        int[] b_array = new int[100];
        
        for (int i = 0; i < a_array.length; i++) {
            a_array[i] = i * 2;
        }
        
        for (int i = 0; i < b_array.length; i++) {
            b_array[i] = a_array[99 - i];
        }
        System.out.println("a_array" + Arrays.toString(a_array));
        System.out.println("b_array" + Arrays.toString(b_array));
        for (int a :
                a_array) {
            System.out.println(a);
        }
        
        for (int b :
                b_array) {
            System.out.println(b);
        }
        
    }
}
