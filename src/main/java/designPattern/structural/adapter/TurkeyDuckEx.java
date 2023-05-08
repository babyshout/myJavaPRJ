package designPattern.structural.adapter;

interface Duck {
    public void quack();
    
    public void fly();
}

class MallardDuck implements Duck {
    
    public void quack() {
        System.out.println("꽥! 꽥!");
    }
    
    public void fly() {
        System.out.println("날라갈 수 있습니다!");
    }
}

interface Turkey {
    public void gobble();
    
    public void fly();
}

class WildTurkey implements Turkey {
    
    public void gobble() {
        System.out.println("고르륵! 고르륵!");
    }
    
    public void fly() {
        System.out.println("짧은거리만 날라갈 수 있습니다.");
    }
}

class TurkeyAdapter implements Duck {
    
    Turkey turkey;
    
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    public void quack() {
        turkey.gobble();
    }
    
    public void fly() {
        turkey.fly();
    }
}

public class TurkeyDuckEx {
    public static void main(String[] args) {
        System.out.println("칠면조가 웁니다.");
        WildTurkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        
        System.out.println("칠면조 어댑터가 웁니다.");
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        
        System.out.println("오리가 웁니다.");
        MallardDuck duck = new MallardDuck();
        duck.quack();
        duck.fly();
    }
}
