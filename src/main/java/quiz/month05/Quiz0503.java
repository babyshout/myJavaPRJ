package quiz.month05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Quiz0503 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();    //컬렉션프레임워크 list 선언(안에 담을건 Integer)
        Scanner sc = new Scanner(System.in);    //값 입력받을 Scanner sc
        
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt()); //값을 5번 입력받음
        }
//        int input = 0;
//        AtomicBoolean flag = new AtomicBoolean(false);
//        for (int i = 0; i < 5; i++) {
//            flag.set(true);
//            while (flag.get()) {
//                flag.set(false);
//                input = sc.nextInt();
//                int finalInput = input;
//                list.parallelStream().forEach(integer -> {
//                    if (integer == finalInput) {
//                        flag.set(true);
//                    }
//                });
//            }
//            list.add(input);
//        }
//        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {   //안에 들어있는게 Integer 이기 때문에 연산자 == 사용가능
                    list.remove(j); //i번째 있는건 그대로 두고 j가 같을경우 계속 제거함
                    j--;    //list 크기가 1 줄어들었으므로 j에 1을 빼줌
                }
            }
        }
        
        System.out.println(list);   //출력
    }
}
