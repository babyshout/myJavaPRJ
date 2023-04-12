package book.bible2nd.ch14IO.part3ByteBaseSub;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        
        try {
            fis = new FileInputStream("score.txt");
            dis = new DataInputStream(fis);
            
            while (true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch (IOException e) {
            System.out.println("점수의 총합은 " + sum + "입니다.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("점수의 총합은 " + sum + "입니다.");
            e.printStackTrace();
        } finally {
            try {
                if (dis != null)
                    dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }   //try
    }   //main
}
