package book.bible2nd.ch9langpackage.part5Wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
    
        System.out.println("i1 == i2? " + (i1 == i2));
        System.out.println("i1.equals(i2)? " + i1.equals(i2));
        System.out.println("i1.toString() = " + i1.toString());   //System.out.println("i1.toString()=" + i1);
    
        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + "bits");
        System.out.println("TYPE = " + Integer.TYPE);
    }
}
