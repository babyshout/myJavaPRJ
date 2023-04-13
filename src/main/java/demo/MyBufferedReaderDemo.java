package demo;

import java.io.*;

public class MyBufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new CharArrayWriter());
        
        char[] temp = new char[10];
        
        try {
            for (int i = 0; i < 3; i++) {
                bw.write(br.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}