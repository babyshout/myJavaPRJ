package demo.annot.withGPT.kor;

public class MyCustomAnnotationMain {
    public static void main(String[] args) {
        MyCustomAnnotationMain myMain = new MyCustomAnnotationMain();
        
        myMain.myMethod();
    }
    
    @CustomAnnotation
    void myMethod(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
