package book.forbeginner.school;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        
        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");
        
        System.out.println("조회결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));
        
        //맵의 키는 중복되지 않으며, Set 데이터구조와 같이 중복을 허용하지 않음
        //entrySet 은 Map 구조 데이터를 Set 구조로 변환하기 위해 개발된 데이터 구조
        //Map 저장된 데이터 한개마다 Set 구조로 데이터를 저장함
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}
