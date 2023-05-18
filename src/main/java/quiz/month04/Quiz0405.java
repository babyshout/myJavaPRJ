package quiz.month04;

public class Quiz0405 {
    public static void main(String[] args) {
        int i, j;
        
        
        i = 2;
        j = 1;
        while (i < 10) {
            
            System.out.printf("%d * %d = %d\n", i, j, i * j);
            
            j++;
            
            if (j == 10) {
                i++;
                j = 1;
                System.out.printf("\n");
            }
            
        }
        
        
    }
}
