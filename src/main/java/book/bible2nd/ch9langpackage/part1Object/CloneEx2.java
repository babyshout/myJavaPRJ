package book.bible2nd.ch9langpackage.part1Object;

import java.util.Arrays;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        // 배열 arr 을 복제해서 같은 내용의 새로운 배열을 만든다.
        int[] arrClone = arr.clone();
        arrClone[0] = 6;
    
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
        
        
        System.out.println(arr);
        System.out.println(arrClone);
    }
}
