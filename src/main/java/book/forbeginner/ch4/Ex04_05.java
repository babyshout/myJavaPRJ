package book.forbeginner.ch4;

public class Ex04_05 {
    public static void main(String[] args) {
        int a = 100, b = 200;

        System.out.printf("%d == %d 는 %s 이다.\n", a, b, a == b);
        System.out.printf("%d != %d 는 %s 이다.\n", a, b, a != b);
        System.out.printf("%d > %d 는 %s 이다.\n", a, b, a > b);
        System.out.printf("%d < %d 는 %s 이다.\n", a, b, a < b);
        System.out.printf("%d >= %d 는 %s 이다.\n", a, b, a >= b);
        System.out.printf("%d <= %d 는 %s 이다.\n", a, b, a <= b);

        System.out.printf("%d = %d 는 %s 이다.\n", a, b, a = b);

        boolean tst = false;

        if(tst == 100 > 200){
            System.out.println("true" + tst);
        } else
            System.out.println("false" + tst);

    }
}
