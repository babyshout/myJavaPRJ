package practice.star;

public class StarPlusMinus {

    public static void main(String[] args) {

        int a = 5;

//        for (int i = 0; i < a * 2; i++) {
//
//            if (i < a) {
//                for (int j = 0; j < a; j++) {
//                    if (a - i <= j)
//                        System.out.printf("*");
//                    else
//                        System.out.printf(" ");
//                }
//
//            } else {
//                for (int j = a; j > 0; j--) {
//                    if (i - a < j)
//                        System.out.printf("*");
//                    else
//                        System.out.printf(" ");
//                }
//
//            }
//            System.out.printf("\n");
//        }

//        >

        for (int i = 0; i < a * 2; i++) {
            if (i < a) {
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }
            } else {
                for (int j = a; j > i - a; j--) {
                    System.out.printf("*");
                }
            }
            System.out.printf("\n");
        }

//        int b = 7;
//        int c = 0;
//        for (int i = 0; i < b; i++) {
//            c += i;
//            // c = c + i;
//        }
//
//        System.out.println(c);

//        int c = 0;
//        int b = 0;
//
//        while(c <= 10){
//
//            b += c;
//
//            c++;
//
//
//        }
//
//        System.out.printf("%d", b);



//        <

//        for (int i = 0; i < a * 2; i++) {
//
//            if (i < a) {
//                for (int j = 0; j < a; j++) {
//                    if (i > j)
//                        System.out.printf(" ");
//                    else
//                        System.out.printf("*");
//                }
//            } else {
//                for (int j = a; j > 0; j--) {
//                    if (i - a >= j)
//                        System.out.printf("*");
//                    else
//                        System.out.printf(" ");
//                }
//            }
//            System.out.printf("\n");
//
//
////            for (int j = a; j > 0; j--) {
////
////                if(a - j > a)
////                    System.out.printf("*");
////                else
////                    System.out.printf(" ");
////
////            }
//
//
//
//
////            if (a > i) {
////
////                for (int j = a; j > 0; j--) {
////                    System.out.printf(" ");
////                }
////            } else {
////                for (int j = 0; j < i; j++) {
////                    System.out.printf("*");
////                }
////            }
//
////            for (int j = 0; j < a; j++) {
////                if (j < i)
////                    System.out.printf(" ");
////                else
////                    System.out.printf("*");
////            }
//
//        }







//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                if (i <= j){
//                    System.out.printf("*");
//                } else {
//                    System.out.printf(" ");
//                }
//            }
//            System.out.printf("\n");
//        }

    }

}
