package book.bible2nd.ch14IO.part2ByteBase.ByteArrayIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx4 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        
        byte[] temp = new byte[4];  //이전 예제와 배열의 크기가 다름
        
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();
        
        try {
            while (input.available() > 0) {

                int len = input.read(temp); //읽어온 데이터의 개수를 반환
                output.write(temp, 0, len); //읽어 온 만큼만 write()한다
                
                System.out.println("temp : " + Arrays.toString(temp));  //주석을 했다 말았다 하면서 보자
            }
        } catch (IOException e) {
        }
        
        outSrc = output.toByteArray();
        
        System.out.println("Input Source : " + Arrays.toString(inSrc));
        System.out.println("temp : " + Arrays.toString(temp));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }
}
