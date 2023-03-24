package book.bible.ch7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;  // 실행시 에러 발생. 참조변수 car가 참조하고 있는 인스턴스는 Car라서 오류 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
