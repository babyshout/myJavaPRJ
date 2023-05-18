package quiz.month03;

public class Quiz0331 {
    public static void main(String[] args) {
        
        String str = "";
        
        for (int i = 0; i < 5; i++) {
            
            str += "*";
            
            System.out.printf("%s\n", str);
            
        }
        
        System.out.printf("\n");
        
        for (int i = 1, j = 1; j < 6; i++) {
            
            if (i <= j) {
                System.out.printf("*");
            }
            
            if (i >= j) {
                System.out.printf("\n");
                j++;
                i = 0;
            }
        }
        
        int i = 0;
        int j = 0;
        
        do {
            
            if (i < j) {
                System.out.printf("*");
                i++;
            }
            
            if (i >= j) {
                System.out.printf("\n");
                j++;
                i = 0;
            }
            
        } while (j < 6);
        
    }
}
