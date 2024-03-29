package book.bible2nd.ch14IO.part3ByteBaseSub;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("sample.txt");
            DataInputStream dis = new DataInputStream(fis);
            
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   //main
}
