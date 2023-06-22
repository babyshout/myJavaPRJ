package practice.final_exam;

import java.util.ArrayList;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(4);
        
        System.out.println(list);
        
        int index;
        
        for (int i = 0; i < list.size(); i++) {
            index = i;
            for (int j = i; j < list.size(); j++) {
                if(list.get(index) > list.get(j))
                    index = j;
            }
            list.add(i, list.get(index));
            list.remove(index + 1);
        }
        
        list.forEach(value -> System.out.print(value + "  "));
    }
}
