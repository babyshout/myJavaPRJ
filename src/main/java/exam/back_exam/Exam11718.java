package exam.back_exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam11718 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

////        String str = "";
//
//        while ((str = br.readLine()) != null) {
//            System.out.println(str);
//        }


        StringBuilder builder = new StringBuilder();
        while(true){
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            builder.append(str).append("\n");
        }
        br.close();
        System.out.println(builder);



    }
}
