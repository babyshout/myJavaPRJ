package designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject (주제) 인터페이스
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// ConcreteSubject (구체적인 주제) 클래스
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

// Observer (옵저버) 인터페이스
interface Observer {
    void update(int state);
}

// ConcreteObserver (구체적인 옵저버) 클래스
class ConcreteObserver implements Observer {
    private int observerState;

    public void update(int state) {
        observerState = state;
        System.out.println("Observer state updated: " + observerState);
    }
}

// 클라이언트 코드
public class ObserverPattern01 {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState(10);
        subject.setState(20);

        subject.removeObserver(observer2);

        subject.setState(30);
    }
}
