package quiz.mon04;

import java.util.Scanner;

public class Quiz0417 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            //중복된 값 제외하고 입력받기
//            flag = true;
//            while (flag) {
//                flag = false;
//                arr[i] = sc.nextInt();
//                for (int j = 0; j < i; j++) {
//                    if (arr[j] == arr[i])
//                        flag = true;
//                }
//            }
        }
        
        //버블소트
//        int tmp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    tmp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
        System.out.print("저장된 값은 ");
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.printf("%d ", arr[i]);
        }
        System.out.print("입니다. \n");
    }
}