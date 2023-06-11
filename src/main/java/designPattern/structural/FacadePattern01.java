package designPattern.structural;


// 서브시스템 클래스들
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
    
    public void stop() {
        System.out.println("Engine stopped");
    }
}

class FuelInjector {
    public void on() {
        System.out.println("Fuel injector turned on");
    }
    
    public void off() {
        System.out.println("Fuel injector turned off");
    }
}

class Ignition {
    public void ignite() {
        System.out.println("Ignition ignited");
    }
    
    public void stopIgnition() {
        System.out.println("Ignition stopped");
    }
}

// 퍼사드 클래스
class CarFacade {
    private Engine engine;
    private FuelInjector fuelInjector;
    private Ignition ignition;
    
    public CarFacade() {
        engine = new Engine();
        fuelInjector = new FuelInjector();
        ignition = new Ignition();
    }
    
    public void startCar() {
        fuelInjector.on();
        engine.start();
        ignition.ignite();
        System.out.println("Car started and ready to go!");
    }
    
    public void stopCar() {
        engine.stop();
        fuelInjector.off();
        ignition.stopIgnition();
        System.out.println("Car stopped");
    }
}

// 클라이언트 코드
public class FacadePattern01 {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        
        // 자동차 시작
        car.startCar();
        
        // 자동차 정지
        car.stopCar();
    }
}
