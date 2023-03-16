package book.bible.ch6.part6;

public class Ex06_22 {

    static {
        System.out.println("static { } ");
    }

    {
        System.out.println("{ }");
    }

    public Ex06_22 () {
        System.out.println("constructor");
    }

    public static void main (String args[]) {

        System.out.println("Ex06_22 class1 = new Ex06_22()");
        Ex06_22 class1 = new Ex06_22();

        System.out.println("Ex06_22 class2 = new Ex06_22()");
        Ex06_22 class2 = new Ex06_22();

    }

}
