package book.bible.ch7;

class A {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    int justInt = 0;
    static int staticInt = 0;
    final int finalInt = 0;
    static final int staticFinalInt = 0;
    final static int finalStaticInt = 0;
//    항상 final static 의 변수(상수)만을 가질수 있음

    public abstract void play();

    public static void interfaceIStatic() {
        System.out.println("I's interfaceIStatic");
    }
//    public static void 함수 가능 (구현 필요)(추상화 함수가 아니기 때문)(어떻게???)
}

interface IChild extends I {
    public static void interfaceIStatic() {
//        super.interfaceIStatic(); 에러!!! 상속받았어도 부모의 함수 사용 불가능(선언도 안되어있고 static이라 I.interfaceIStatic()하면 가능해서 인듯)
        System.out.println("IChild's interfaceIStatic");
    }
    public default void interfaceIStaticDefault() {
//        default 사용 가능 왜??
//        나중에 구현시 사용가능
//        public default는 도대체 머임??
        System.out.println("IChild's interfaceIStaticDefault");
    }
}

class B implements I {

    I i = new I() {
        @Override
        public void play() {
            System.out.println("I in B play @Override");
        }
//        클래스안에 인터페이스 생성 가능   (추상메서드 구현 필요)
    };

    public void play() {
        System.out.println("play in B class");
        i.play();
    }


    static void interfaceIStatic() {
        System.out.println("B's interfaceIStatic");
    }

    static void interfaceSuperTest() {
//        super.interfaceIStatic();
//        인터페이스는 상속받는게아니라 super.~~ 불가능
    }
}

class C implements I {
    public void play() {
        System.out.println("play in C class");
    }

}

public class InterfaceTest2WithAnnotation {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.autoPlay(new B());
        a.autoPlay(new C());

        System.out.println();
        B.interfaceIStatic();

        System.out.println();
        b.play();

        System.out.println();
        I.interfaceIStatic();

        System.out.println();
        IChild.interfaceIStatic();
        IChild ichild = new IChild() {
            @Override
            public void play() {
                System.out.println("in main");
            }
        };
        ichild.interfaceIStaticDefault();
    }
}
