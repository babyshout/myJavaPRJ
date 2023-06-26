package practice.final_exam;

import java.util.*;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(4);
        
        System.out.println(list);
        
        Collections.sort(list);
        
        int a = (int) (1.5 + 2.5);
        
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
