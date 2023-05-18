package quiz.month05;

import java.util.*;

public class Quiz0502 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();    //값을 저장할 List 컬렉션 프레임워크
        Scanner sc = new Scanner(System.in);    //값을 입력받을 Scanner
        
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt()); //5번 값을 입력받음(뒤로 차곡차곡 쌓임)
        }
        
        //selection sort
        int index;
        for (int i = 0; i < list.size(); i++) {
            index = i;  //index 는 i 번째로 초기화해줌
            for (int j = i; j < list.size(); j++) {
                if (list.get(index) < list.get(j)) {    //index 번째가 j 번째보다 작으면 최솟값이 아니므로
                    index = j;  //index 에 j 를 넣어줌
                }
            }
            list.add(i, list.get(index));   //i 번째의 앞에 index 에 있는 값을 넣어줌
            list.remove(index + 1); //list 가 1 커졌으므로 index + 1 의 자리에 있는 값을 지워줌
        }
        
        System.out.println(list);   //출력
        
    }
}
