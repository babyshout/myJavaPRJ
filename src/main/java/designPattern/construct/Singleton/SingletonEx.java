package designPattern.construct.Singleton;

class Singleton {
    private static Singleton singleton = new Singleton();
    
    private Singleton() {
        //싱글톤 객체를 초기화하는 코드
    }
    
//    static {    //할수있지만 가독성이 안좋아 보임
//        singleton = new Singleton();
//    }
    
    //싱글톤 객체에 접근할수 있게 해줌
    public static Singleton getInstance() {
        return singleton;
    }
    
    @Override
    public String toString() {
        return "Singleton test";
    }
}

//자식 클래스에서 부모의 생성자(private)을 호출할수 없기때문에 자식을 가질수없음
//class SingletonChild extends Singleton {
//    SingletonChild() {
//        super = Singleton.getInstance();
//
//    }
//}

public class SingletonEx {
    public static void main(String[] args) {
        Singleton sg = Singleton.getInstance();
        
        System.out.println(sg);
    }
}
