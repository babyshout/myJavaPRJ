package book.bible2nd.ch7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent p  = new Child();
        Parent p1 = new Parent();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();

        System.out.println("p1.x = " + p1.x);
        p1.method();
        System.out.println();

        System.out.println("c.x = " + c.x);
        c.method();
        System.out.println();

    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}