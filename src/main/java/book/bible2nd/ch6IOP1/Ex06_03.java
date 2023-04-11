package book.bible2nd.ch6IOP1;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() {
        channel--;
    }
}


public class Ex06_03 {

    public static void main (String args[]) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();



        System.out.println("tv1.channel" + tv1.channel);
        System.out.println("tv2.channel" + tv2.channel);

        tv2 = tv1;

        tv1.channel = 7;

        System.out.println("tv1.channel change " + tv1.channel);

        System.out.println("tv1.channel" + tv1.channel);
        System.out.println("tv2.channel" + tv2.channel);






    }


}
