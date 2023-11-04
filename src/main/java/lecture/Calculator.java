package lecture;

class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
//        System.out.println(calculatorService.calculator(1, 2));
        int plus = calculatorService.calculator(1, 1, '+');


    }
}
class CalculatorService {
    public int calculator(int a, int b, char operator) {
        if (operator == '-') {
            return a - b;
        } else if (operator == '+') {
            return a + b;
        } else {
            throw new IllegalArgumentException("이상한 아규먼트");
        }
    }
}

