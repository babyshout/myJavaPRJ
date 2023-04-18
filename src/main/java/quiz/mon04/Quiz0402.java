package quiz.mon04;

public class Quiz0402 {
    public static void main(String[] args) {
        
        //역삼각형 for 하나
        
        int input = 5;
        
        for (int i = input, j = 0; i > 0; j++) {
            
            if (i >= j) {
                System.out.printf("*");
            }
            
            if (i == j) {
                i--;
                j = 0;
                System.out.printf("\n");
            }
            
        }
        
    }
}
