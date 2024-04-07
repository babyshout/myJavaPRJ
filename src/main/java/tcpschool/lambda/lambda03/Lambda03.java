package tcpschool.lambda.lambda03;

import java.util.function.*;

public class Lambda03 {
    public static void main(String[] args){
        DoubleUnaryOperator oper;

        oper = (n) -> Math.abs(n);	// 람다 표현식
        System.out.println(oper.applyAsDouble(-5));

        oper = Math::abs;			// 메소드 참조
        System.out.println(oper.applyAsDouble(-5));

        Function<Integer, double[]> func1 = a -> new double[a]; // 람다 표현식
        Function<Integer, double[]> func2 = double[]::new;      // 생성자 참조

        System.out.println(func1);
        System.out.println(func2);
    }
}