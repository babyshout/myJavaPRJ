package designPattern.construct.Prototype;

// Prototype 인터페이스
interface Prototype extends Cloneable {
    Prototype clone();
}

// ConcretePrototype1 클래스
class ConcretePrototype1 implements Prototype {
    private int value;
    
    public ConcretePrototype1(int value) {
        this.value = value;
    }
    
    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.value);
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}

// ConcretePrototype2 클래스
class ConcretePrototype2 implements Prototype {
    private String name;
    
    public ConcretePrototype2(String name) {
        this.name = name;
    }
    
    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

// 클라이언트 클래스
class Client {
    public static void main(String[] args) {
        // 원본 객체를 생성합니다.
        ConcretePrototype1 original1 = new ConcretePrototype1(100);
        ConcretePrototype2 original2 = new ConcretePrototype2("Prototype Pattern");
        
        // 원본 객체로부터 복제를 생성합니다.
        ConcretePrototype1 cloned1 = (ConcretePrototype1) original1.clone();
        ConcretePrototype2 cloned2 = (ConcretePrototype2) original2.clone();
        
        // 복제된 객체들의 값을 확인합니다.
        System.out.println("Cloned1 Value: " + cloned1.getValue()); // 출력 결과: Cloned1 Value: 100
        System.out.println("Cloned2 Name: " + cloned2.getName());   // 출력 결과: Cloned2 Name: Prototype Pattern
        
        // 복제된 객체들의 값이 원본과 독립적으로 변경 가능합니다.
        cloned1.setValue(200);
        cloned2.setName("New Prototype");
        
        System.out.println("Original1 Value: " + original1.getValue()); // 출력 결과: Original1 Value: 100
        System.out.println("Original2 Name: " + original2.getName());   // 출력 결과: Original2 Name: Prototype Pattern
    }
}
