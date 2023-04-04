package book.forbeginner.ch6;

public class Ex06_14 {
    public static void main(String[] args) {

        System.out.printf("99단 시작~\n\n");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%d단 시작합니다~\n", i);

            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d \n", i, j, i * j);
//                for (int k = 1; k < 10; k++) {
//                    System.out.printf("%d * %d * %d = %d \n", i, j, k, i * j * k);
//                }
            }
            System.out.printf("\n");
        }

        System.out.printf("99단 끝~ \n");
    }
}
