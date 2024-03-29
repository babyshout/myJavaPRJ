package book.bible2nd.ch10InnerClass;

class Outer1 {
    class InstanceInner {
        int iv = 400;
    }
    
    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }
    
    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

public class InnerEx4 {
    
    public static void main(String[] args) {
        //인스턴스클래스의 인스턴스를 생성하려면
        //외부 클래스의 인스턴스를 먼저 생성해야 한다.
        Outer1 oc = new Outer1();
        Outer1.InstanceInner ii = oc.new InstanceInner();
        
        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer1.StaticInner.cv : " + Outer1.StaticInner.cv);
        
        
        //스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer1.StaticInner si = new Outer1.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}
