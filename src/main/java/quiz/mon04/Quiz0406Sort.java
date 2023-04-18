package quiz.mon04;

import java.util.*;

public class Quiz0406Sort {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int temp;
        boolean flag;
        Scanner sc = new Scanner(System.in);
        
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            flag = true;
            while (flag) {
                flag = false;
                arr[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j])
                        flag = true;
                }
            }
        }
        //selection
        int index;
        for (int i = 0; i < arrayLength; i++) {
            index = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (arr[index] > arr[j])
                    index = j;
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
        
        
//        //bubble
//        for (int i = 0; i < arrayLength; i++) {
//            for (int j = 1; j < arrayLength - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    
    }
}
