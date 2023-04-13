package book.bible2nd.ch14IO.part3ByteBaseSub;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");
            //BufferedOutputStream 의 버퍼크기를 5로 한다.
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            //파일 123.txt 에 1부터 9까지 출력한다
            for (int i = '1'; i < '9'; i++) {
                bos.write(i);
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
