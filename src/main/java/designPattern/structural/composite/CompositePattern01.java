package designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

abstract class Component {
    protected String name;
    
    public Component(String name) {
        this.name = name;
    }
    
    public abstract void display();
}


class Composite extends Component {
    private List<Component> components;
    
    public Composite(String name) {
        super(name);
        components = new ArrayList<>();
    }
    
    public void addComponent(Component component) {
        components.add(component);
    }
    
    public void removeComponent(Component component) {
        components.remove(component);
    }
    
    public void display() {
        System.out.println("Directory: " + name);
        for (Component component : components) {
            component.display();
        }
    }
}

class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }
    
    public void display() {
        System.out.println("File: " + name);
    }
}

public class CompositePattern01 {
    public static void main(String[] args) {
        // 루트 디렉토리 생성
        Composite root = new Composite("Root");
        
        // 서브 디렉토리 생성
        Composite dir1 = new Composite("Directory 1");
        Composite dir2 = new Composite("Directory 2");
        
        // 파일 생성
        Leaf file1 = new Leaf("File 1");
        Leaf file2 = new Leaf("File 2");
        Leaf file3 = new Leaf("File 3");
        
        // 디렉토리에 파일 추가
        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(file3);
        
        // 루트 디렉토리에 서브 디렉토리 추가
        root.addComponent(dir1);
        root.addComponent(dir2);
        
        
    }
}
