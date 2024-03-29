package book.bible3rd.ch14.lambda;

@FunctionalInterface
interface MyFunctionEx1 {
    void run();  // public abstract void run();
}

class LambdaEx1 {
    static void execute(MyFunctionEx1 f) { // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunctionEx1 getMyFunction() { // 반환 타입이 MyFunction인 메서드
        MyFunctionEx1 f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunctionEx1 f1 = () -> System.out.println("f1.run()");

        MyFunctionEx1 f2 = new MyFunctionEx1() {  // 익명클래스로 run()을 구현
            public void run() {   // public을 반드시 붙여야 함
                System.out.println("f2.run()");
            }
        };

        MyFunctionEx1 f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}