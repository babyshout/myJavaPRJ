package designPattern.construct.Singleton;

class Singleton02 {
    static Singleton02 instance;
    
    private Singleton02() {
    
    }
    
    static public Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
    
}

public class SingletonPattern02 {
    public static void main(String[] args) {
        Singleton02 single01 = Singleton02.getInstance();
        System.out.println("single01 = " + single01);
        Singleton02 single02 = Singleton02.getInstance();
        System.out.println("single02 = " + single02);
    }
}
