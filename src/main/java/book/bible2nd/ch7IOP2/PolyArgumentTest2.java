//package book.bible.ch7;
//
//class Product {
//    int price;  //제품의 가격
//    int bonusPoint; //제품구매 시 제공하는 보너스점수
//
//    Product(int price) {
//        this.price = price;
//        this.bonusPoint = (int)(price/10.0);    //보너스점수는 price의 10%
//    }
//}
//
//class Tv extends Product {
//    Tv() {
//        //조상클래스의 생성자 Product(int price)를 호출
//        super(100); //Tv의 가격 100
//    }
//
//    public String toString() {  //Object 클래스의 toString() 을 오버라이딩
//        return "Tv";
//    }
//}
//
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//
//    public String toString() {
//        return "Computer";
//    }
//}
//
//class Audio extends Product {
//    Audio() {
//        super(50);
//    }
//
//    public String toString() {
//        return "Audio";
//    }
//}
//
//class Buyer {           //고객, 물건을 사는 사람
//    int money = 1000;   //소유금액
//    int bonusPoint = 0; //보너스점수
//    Product[] item = new Product[10];   //구입한 제품을 저장하기 위한 배열
//    int i = 0;  //Product 배열에 사용될 카운터
//
//    void buy(Product p) {
//        if(money < p.price) {
//            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
//            return;
//        }
//
//        money -= p.price;           //가진 돈에서 구입한 제품의 가격을 뺀다.
//        bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가한다.
//        item[i++] = p;  //제품을 Product[] item 에 저장한다
//        System.out.println(p + "을/를 구입하셨습니다");
//    }
//
//    void summary() {    //구매한 물품에 대한 정보를 요약해서 보여 준다.
//        int sum = 0;    //구입한 물품의 가격합계
//        String itemList = "";   //구입한 물품 목록
//
//        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
//        for(int i = 0; i<item.length; i++){
//            if(item[i] == null) break;
//            sum += item[i].price;
//            itemList += item[i] + ", ";
//        }
//        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
//        System.out.println("구입하신 제품은 " + itemList + "입니다.");
//    }
//}
//
//public class PolyArgumentTest2 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        Tv tv = new Tv();
//        Computer com = new Computer();
//        Audio audio = new Audio();
//
//        b.buy(tv);
//        b.buy(com);
//        b.buy(audio);
//
//        b.summary();
//
////        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
////        System.out.println("현재 보너스점수는 " + b.bonusPoint + "입니다.");
//
//////        PrintStream
////        public void print(Object obj){
////            write(String.valueOf(obj));
////        }
//////        String
////        public static String valueOf(Object obj) {
////            return (obj == null) ? "null" : obj.toString();
////        }
//    }
//}
