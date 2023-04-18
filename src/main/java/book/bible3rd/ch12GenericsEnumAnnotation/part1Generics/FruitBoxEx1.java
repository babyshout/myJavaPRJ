package book.bible3rd.ch12GenericsEnumAnnotation.part1Generics;

import java.util.ArrayList;

class Fruit1 {
    public String toString() {
        return "Fruit1";
    }
}

class Apple1 extends Fruit1 {
    public String toString() {
        return "Apple1";
    }
}

class Grape1 extends Fruit1 {
    public String toString() {
        return "Grape1";
    }
}

class Toy1 {
    public String toString() {
        return "Toy1";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box1<Fruit1> fruitBox1 = new Box1<Fruit1>();
        Box1<Apple1> appleBox1 = new Box1<Apple1>();
        Box1<Toy1> toyBox1 = new Box1<Toy1>();
//        Box1<Grape1> grapeBox = new Box1<Apple1>();   //에러. 타입 불일치
        fruitBox1.add(new Fruit1());
        fruitBox1.add(new Apple1());  //OK.   void add(Fruit1 item);
    
        appleBox1.add(new Apple1());
        appleBox1.add(new Apple1());
//        appleBox1.add(new Toy1());    //에러. Box1<Apple1>에는 Apple만 담을 수 있음.
        
        toyBox1.add(new Toy1());
//        toyBox1.add(new Apple1());    //에러. Box1<Toy1>에는 Apple1 만 담을 수 있음.
    
        System.out.println(fruitBox1);
        System.out.println(appleBox1);
        System.out.println(toyBox1);
        
    }
}

class Box1<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    public String toString() {
        return list.toString();
    }
}
