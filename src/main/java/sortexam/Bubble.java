package sortexam;

public class Bubble {
    public static void main(String[] args) {
        int a_array[] = new int[20];
        
        for (int i = 0; i < a_array.length; i++) {
            a_array[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", a_array[i]);
        }
        
        for (int i = 0; i < a_array.length; i++) {
            int tmp;
            for (int j = 0; j < a_array.length - i - 1; j++) {
                if (a_array[j + 1] < a_array[j]) {
                    tmp = a_array[j + 1];
                    a_array[j + 1] = a_array[j];
                    a_array[j] = tmp;
                }
            }
        }
        
        System.out.printf("\n");
        
        for (int i = 0; i < a_array.length; i++) {
            System.out.printf("%d ", a_array[i]);
        }
        
        
    }
    
}
