package book.forbeginner.ch11;

class Car {

    private String color;
    private int speed = 0;

    Car() {
        color = "led";
        speed = 0;
    }

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    protected void setColor(String color){
        this.color = color;
    }

    void colorPrint () {
        System.out.printf("Color is " + color + "\n");
    }


    void speedUp(int speed){
        if (this.speed + speed > 200)
            this.speed = 200;
        else
            this.speed = this.speed + speed;

        System.out.println("speed = " + this.speed);

    }


    void speedDown(int value) {
        if (speed - value < 0)
            speed = 0;
        else
            speed = speed - value;

        System.out.println("speed = " + speed);

    }

    void speedPrint() {
        System.out.printf("speed is " + speed + "\n");
    }

}
public class Ex11_01 {

    public static void main(String[] args){

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();

        myCar1.speedUp(30);
        myCar1.speedPrint();
        myCar1.colorPrint();

        myCar1.setColor("red");
        myCar1.colorPrint();

        myCar2.speedUp(50);
        myCar2.speedPrint();

        myCar3.speedUp(80);
        myCar3.speedPrint();
        
    }

}
