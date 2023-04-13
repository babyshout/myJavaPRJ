package book.bible2nd.ch14IO.part6StandardIOFile.sysIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("test1.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);  //System.out 의 출력대상을 test1.txt 로 변경
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
        
        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
