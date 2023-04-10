package book.bible.ch10;

public class InnerEx6 {
    Object iv = new Object() {
        void method() {
        }
    };  //익명클래스
    static Object cv = new Object() {
        void method() {}
    };  //익명클래스
    
    void myMethod() {
        Object iv = new Object() {
            void method() {}
        };  //익명클래스
    }
}
