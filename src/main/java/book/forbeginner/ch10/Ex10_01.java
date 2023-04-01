package book.forbeginner.ch10;

public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        int a = aa.length;


        try {
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
            System.out.println("배열 첨자가 배열 크기보다 커요~");
        }


    }
}
