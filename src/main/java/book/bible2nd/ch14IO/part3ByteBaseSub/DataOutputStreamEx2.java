package book.bible2nd.ch14IO.part3ByteBaseSub;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataOutputStreamEx2 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = null;
        DataOutputStream dos = null;
        
        byte[] result = null;
        
        try {
            baos = new ByteArrayOutputStream();
            dos = new DataOutputStream(baos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            
            result = baos.toByteArray();
            
            String[] hex = new String[result.length];
            
            for (int i = 0; i < result.length; i++) {
                if (result[i] < 0) {
                    hex[i] = Integer.toHexString(result[i] + 256);
                } else {
                    hex[i] = Integer.toHexString(result[i]);
                }
                
                //hex[i] = "0" + hex[i];
                //hex[i] = hex[i].substring(hex[i].length() - 2);
            }
            
            System.out.println("10진수 : " + Arrays.toString(result));
            System.out.println("16진수 : " + Arrays.toString(hex));
            
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   //main
}
