package demo;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int begin, mid, end, count = 0, tmp;

        for (int i = 0; i < m; i++) {
            begin = sc.nextInt();
            end = sc.nextInt();
            mid = sc.nextInt();

            int a = mid - begin;

            for (int j = mid; j < end + 1 ; j++) {
                count++;
                for (int k = j - 1; k > begin - 2 + count; k--) {
                    tmp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = tmp;
                }
            }
            count = 0;

        }

        System.out.println(Arrays.toString(arr));
    }
}
