package demo.enumEx.section1;

import java.util.function.Function;

public class EnumEx3 {
    public static void main(String[] args) {
        CalculatorType code = null;

        long originValue = 10000L;
        long result = code.calculate(originValue);
        System.out.println(result);
    }
}

enum CalculatorType {
    CALC_A(value -> value),
    CALC_B(value -> value * 10),
    CALC_C(value -> value * 3),
    CALC_D(value -> 0L);

    private Function<Long, Long> expression;

    private CalculatorType(Function<Long, Long> expression) {
        this.expression = expression;
    }

    public long calculate(long value) {
        return expression.apply(value);
    }

}