//package book.bible.ch7;
//
//public class BindingTest {
//    public static void main(String[] args) {
//        Parent p  = new Child();
//        Parent p1 = new Parent();
//        Child c = new Child();
//
//        System.out.println("p.x = " + p.x);
//        p.method();
//
//        System.out.println("p1.x = " + p1.x);
//        p1.method();
//
//        System.out.println("c.x = " + c.x);
//        c.method();
//    }
//}
//
//class Parent {
//    int x = 100;
//
//    void method() {
//        System.out.println("Parent method");
//    }
//}
//
//class Child extends Parent {
//    int x = 200;
//
//    void method() {
//        System.out.println("Child method");
//    }
//}