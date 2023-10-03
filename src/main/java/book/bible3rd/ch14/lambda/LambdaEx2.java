package book.bible3rd.ch14.lambda;

@FunctionalInterface
interface MyFunctionEx2 {
    void myMethod();  // public abstract void myMethod();
}

class LambdaEx2 {
    public static void main(String[] args) 	{
        MyFunctionEx2 f = ()->{}; // MyFunctionEx2 f = (MyFunctionEx2)(()->{});
        Object obj = (MyFunctionEx2)(()-> {});  // Object타입으로 형변환이 생략됨
        String str = ((Object)(MyFunctionEx2)(()-> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//		System.out.println(()->{});	// 에러. 람다식은 Object타입으로 형변환 안됨
        System.out.println((MyFunctionEx2)(()-> {}));
//		System.out.println((MyFunctionEx2)(()-> {}).toString()); // 에러
        System.out.println(((Object)(MyFunctionEx2)(()-> {})).toString());
    }
}