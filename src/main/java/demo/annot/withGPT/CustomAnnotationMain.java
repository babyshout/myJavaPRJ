package demo.annot.withGPT;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        CustomAnnotationMain myMain = new CustomAnnotationMain();
        
        myMain.myMethod();
    }
    
    @CustomCode
    void myMethod() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
    }
}
