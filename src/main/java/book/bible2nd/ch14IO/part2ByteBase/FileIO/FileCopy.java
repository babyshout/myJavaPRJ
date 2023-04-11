package book.bible2nd.ch14IO.part2ByteBase.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("error.log");
            FileOutputStream fos = new FileOutputStream("FileCopy.bak");
            
            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);    //void write(int b);
            }
            
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
