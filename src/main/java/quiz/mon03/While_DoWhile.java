package quiz.mon03;

public class While_DoWhile {
    public static void main(String[] args) {
        int a = 0, sum = 0;
    
        while (a < 5){
            sum += a;
            a++;
        }
    
        System.out.printf("%d\n", sum);
    }
}
