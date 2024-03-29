package book.bible2nd.ch14IO.part3ByteBaseSub;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class SequenceInputStreamEx {
    public static void main(String[] args) {
        byte[] arr1 = {0, 1, 2};
        byte[] arr2 = {3, 4, 5};
        byte[] arr3 = {6, 7, 8};
        byte[] outSrc = null;
        
        Vector v = new Vector();
        
        v.add(new ByteArrayInputStream(arr1));
        v.add(new ByteArrayInputStream(arr2));
        v.add(new ByteArrayInputStream(arr3));
        
        SequenceInputStream input = new SequenceInputStream(v.elements());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        int data = 0;
        
        try {
            while ((data = input.read()) != -1) {
                output.write(data); //void write(int b);
            }
        } catch (IOException e) {
        
        }
        outSrc = output.toByteArray();
        
        System.out.println("Input source1 : " + Arrays.toString(arr1));
        System.out.println("Input source2 : " + Arrays.toString(arr2));
        System.out.println("Input source3 : " + Arrays.toString(arr3));
        System.out.println("Output source : " + Arrays.toString(outSrc));
    }
}
