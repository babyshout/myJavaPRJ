package book.forbeginner.school;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("이순신");
        
        int listSize = list.size();
        
        System.out.println("1세대");
        for (int i = 0; i < listSize; i++) {
            System.out.println(list.get(i));
        }
        
        
        System.out.println("1.5세대");
        int i = 0;
        while (i < listSize) {
            System.out.println(list.get(i));
            i++;
        }
        
        System.out.println("2세대");
        for (String str :
                list) {
            System.out.println(str);
        }
    
        final String[] aaa = new String[1];
        System.out.println("3세대");
        list.forEach(str -> {
            System.out.println(str);
            aaa[0] = str;
            System.out.println(aaa[0]);
        });
        
        System.out.println("4세대");
        list.parallelStream().forEach(name -> System.out.println("name : " + name));
        
        
        
    }
}
