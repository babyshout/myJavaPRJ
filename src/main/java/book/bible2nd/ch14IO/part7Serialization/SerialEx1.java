package book.bible2nd.ch14IO.part7Serialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.txt";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
    
            ObjectOutputStream out = new ObjectOutputStream(bos);
            
            UserInfo2 u1 = new UserInfo2("JavaMan", "1234", 30);
            UserInfo2 u2 = new UserInfo2("JavaWoman", "4321", 26);
    
            ArrayList list = new ArrayList();
            list.add(u1);
            list.add(u2);
            
            //객체를 직렬화한다.
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화가 잘 끝났습니다.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
