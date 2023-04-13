package book.bible2nd.ch14IO.part4CharBase;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {
    public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader("test.txt");
            FileWriter fw = new FileWriter("convert.txt");
            
            int data = 0;
            while ((data = fr.read()) != -1) {
                if (data != '\t' && data != '\n' && data != '\r' && data != ' ')
                    fw.write(data);
            }
            
            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   //main
}
