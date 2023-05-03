package book.forbeginner.ch9;

import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, strRep, strSub, strAry[], strRep2;
        
        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();
        
        strRep = str.replace(" ", "$");
        strRep2 = str.replaceAll("\\s", "\\$");
        strSub = str.substring(2, 8);
        strAry = str.split(" ");
        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("바꾼 문자열2 ==> " + strRep2);
        System.out.println("일부 문자열 ==> " + strSub);
        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + " ==> " + strAry[i]);
        }
    }
}
