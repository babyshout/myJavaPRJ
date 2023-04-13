package book.bible2nd.ch14IO.part6StandardIOFile.file;

import java.io.File;
import java.util.Scanner;

public class FileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        if (input.equals("")) {
            System.out.println("USAGE : java FileEx2 DIRECTORY");
        }
        
        File f = new File(input);
        
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }
        
        File[] files = f.listFiles();
        
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
