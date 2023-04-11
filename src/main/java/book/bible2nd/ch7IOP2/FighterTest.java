//package book.bible.ch7;
//
//public class FighterTest {
//    public static void main(String[] args) {
//        Fighter f = new Fighter();
//
//        if (f instanceof Unit)
//            System.out.println("f = Unit's child");
//
//        if (f instanceof Fightable)
//            System.out.println("f implements Fightable interface");
//
//        if (f instanceof Movable)
//            System.out.println("f implements Movable interface");
//
//        if (f instanceof Attackable)
//            System.out.println("f implements Attackable interface");
//
//        if (f instanceof Object)
//            System.out.println("f = Object's child");
//
//    }
//}
//
//class Fighter extends Unit implements  Fightable {
//
//    @Override
//    public void move(int x, int y) {
//        System.out.println("move");
//    }
//
//    @Override
//    public void attack(Unit u) {
//        System.out.println("attack");
//    }
//}
//class Unit {
//    int currentHP;
//    int x;
//    int y;
//}
//interface Fightable extends Movable, Attackable { }
//
//interface Movable { void move(int x, int y); }
//interface Attackable { void attack(Unit u); }