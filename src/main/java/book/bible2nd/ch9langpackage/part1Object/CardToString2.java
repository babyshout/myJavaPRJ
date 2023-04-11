package book.bible2nd.ch9langpackage.part1Object;

class Card {
    String kind;
    int number;
    
    Card() {
        this("SPADE", 1);
    }
    
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    
    public String toString() {
        // Card 인스턴스의 kind 와 number 를 문자열로 반환한다.
        return "kind : " + kind + ", number : " + number;
    }
}

public class CardToString2 {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        System.out.println(c.toString());
        System.out.println(c);
    }
}
