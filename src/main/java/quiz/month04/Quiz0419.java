package quiz.month04;

import java.util.Arrays;

public class Quiz0419 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
    
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1] < arr[j]) {
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        
//        int index = 0;
//        int tmp = arr[0];
//        boolean[] arrIsChecked = new boolean[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (!arrIsChecked[j] && tmp <= arr[j]) {
//                    tmp = arr[j];
//                    index = j;
//
//                }
//            }
//            arrIsChecked[index] = true;
//            System.out.println(Arrays.toString(arrIsChecked));
//            System.out.println(Arrays.toString(arr));
//            System.out.println(arr[index]);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
