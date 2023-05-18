package quiz.month03;

public class Quiz0330 {
    public static void main(String[] args) {
        
        for (int i = 18; i < 90; i++) {
            System.out.printf("%d * %d = %d\n", i / 9, (i % 9) + 1, (i / 9) * ((i % 9) + 1));
        }
    }
}
