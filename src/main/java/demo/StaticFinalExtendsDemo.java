package demo;

public class StaticFinalExtendsDemo {
    public static void main(String[] args) {

    }
}

class Parent {
    static final int a = 10;
    static int b = 20;

}

class Child extends Parent {
    static final int a = 10;
}