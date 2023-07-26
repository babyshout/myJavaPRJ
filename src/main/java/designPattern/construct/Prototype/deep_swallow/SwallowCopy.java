package designPattern.construct.Prototype.deep_swallow;

class PersonSwallow implements Cloneable {
    private String name;
    private AddressDeep address;
    
    public PersonSwallow(String name, AddressDeep address) {
        this.name = name;
        this.address = address;
    }
    
    // clone() 메서드 오버라이딩 (얕은 복제)
    @Override
    public PersonSwallow clone() {
        try {
            return (PersonSwallow) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAddress(AddressDeep address) {
        this.address = address;
    }
    
    public AddressDeep getAddress() {
        return address;
    }
}

class Address {
    private String city;
    
    public Address(String city) {
        this.city = city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
}

public class SwallowCopy {
    public static void main(String[] args) {
        PersonSwallow person1 = new PersonSwallow("Alice", new AddressDeep("New York"));
        PersonSwallow person2 = person1.clone();

// person1과 person2는 같은 객체를 참조하는가?
        System.out.println(person1 == person2); // 출력 결과: false

// person1과 person2의 주소가 같은가?
        System.out.println(person1.getAddress() == person2.getAddress()); // 출력 결과: true
    }
}
