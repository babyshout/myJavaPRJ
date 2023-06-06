package demo.annot.withGPT;

import org.example.MethodLogger;

public class MyAnnotationMain {
    public static void main(String[] args) {
        MyAnnotationMain myMain = new MyAnnotationMain();
        
        myMain.myTestMethod(5);
    }
    
    @MethodLogger
    public void myTestMethod(int inputNum) {
        for (int i = 0; i < inputNum; i++) {
            System.out.println(i);
        }
    }
}
