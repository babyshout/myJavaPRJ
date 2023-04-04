package quiz;

public class Quiz0403 {
    public static void main(String[] args) {
        
        int input = 11;
        
        int a = 1;
        
        for (int i = 0, j = 1; j < input; i++) {
            
            if (i < a) {
                System.out.printf("*");
            }
            
            if (i == j) {
                if (j < input / 2) {
                    i = -1;
                    a++;
                    j++;
                    System.out.printf("\n");
                } else {
                    i = -1;
                    a--;
                    j++;
                    System.out.printf("\n");
                }
            }
            
        }
    }
}
