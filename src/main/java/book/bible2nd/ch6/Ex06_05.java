package book.bible2nd.ch6;

public class Ex06_05 {

    public static void main(String args) {
        Ex06_05 ex0605 = new Ex06_05();

        int result = ex0605.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        ex0605.add(3, 5, result2);
        System.out.println(result2);
    }

    int add(int a, int b) {
        return a + b;
    }

    void  add(int a,  int b, int[] result) {
        result [0] = a + b;
    }

}
