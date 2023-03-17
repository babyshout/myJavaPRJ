package book.forbeginner;

class Calc {
    void addValue (double v1, double v2) {
        System.out.println("double ? + ? calc = " + (v1 + v2));
    }

    void addValue(int v1, int v2) {
        System.out.println("int ? + ? calc = " + (v1 + v2));
    }
}

public class Ex11_09 {

    public static void main(String[] args) {

        Calc calc = new Calc();

        calc.addValue(2,3);

        calc.addValue(2.5, 4.55464);

    }

}
