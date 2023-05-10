package book.forbeginner.ch10;

public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        
        
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
            
//        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
//            System.out.println("배열 첨자가 배열 크기보다 커요~");
//            System.out.println("오류메시지 : " + outOfBoundsException);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나누는 등의 오류예요~");
//            System.out.println("오류메시지 : " + e);
        
        } catch (Exception e) {
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요.");
            System.out.println("오류메시지 : " + e);
        } finally {
            System.out.println("정상동작하던지, 오류가 나던지 finally 는 무조건 실행됩니다.");
        }
        
        
    }
}
