package designPattern.construct.Prototype.deep_swallow;

class PersonDeep implements Cloneable {
    private String name;
    private AddressDeep address;
    
    public PersonDeep(String name, AddressDeep address) {
        this.name = name;
        this.address = address;
    }
    
    // clone() 메서드 오버라이딩 (깊은 복제)
    @Override
    public PersonDeep clone() {
        try {
            PersonDeep clonedPerson = (PersonDeep) super.clone();
            clonedPerson.address = this.address.clone();
            // String 은 class 이기 때문에
            // clone()메서드 사용시 얕은 복제로 인해 같은 객체를 참조하게됨
            clonedPerson.setName(new String(this.name));
            return clonedPerson;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
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

class AddressDeep implements Cloneable {
    private String city;
    
    public AddressDeep(String city) {
        this.city = city;
    }
    
    // clone() 메서드 오버라이딩 (깊은 복제)
    @Override
    public AddressDeep clone() {
        try {
            return (AddressDeep) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        PersonDeep person1 = new PersonDeep("Alice", new AddressDeep("New York"));
        PersonDeep person2 = person1.clone();

// person1과 person2는 같은 객체를 참조하는가?
        System.out.println(person1 == person2); // 출력 결과: false
        
// person1의 String(name)과 person2의 String(name)은 같은객체인가?
        System.out.println(person1.getName() == person2.getName()); // 출력 결과: true


// person1과 person2의 주소가 같은가?
        System.out.println(person1.getAddress() == person2.getAddress()); // 출력 결과: false
    }
}
