package practice.final_exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(4);

        int index;
        for (int i = 0; i < list.size(); i++) {
            index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(index) > list.get(j))
                    index = j;

            }
            list.add(i, list.get(index));
            list.remove(index + 1);
        }
        
        Collections.sort(list);

        list.forEach(i -> System.out.println(i));
    }
}
