package book.forbeginner.school;

import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //최종 저장되는 List 구조
        List<Map<String, String>> list = new ArrayList<>();
        
        //List 구조 안에 저장된 Map 객체
        Map<String, String> map = null;
        
        for (int i = 0; i < 3; i++) {   //세명망 입력하자
            
            System.out.print("이름 : ");
            String name = sc.next();    //이름
            
            System.out.print("이메일 : ");
            String email = sc.next();   //이메일
            
            System.out.print("부서 : ");
            String dept = sc.next();    //부서
            
            map = new HashMap<>();  //List 구조에 저장할 Map 메모리에 올리기
            
            map.put("name", name);  //입력받은 값을 name 키에 저장하기
            map.put("email", email);    //입력받은 값을 email 키에 저장하기
            map.put("dept", dept);  //입력받은 값을 dept 키에 저장하기
            
            list.add(map);  //Map 구조를 List 에 저장하기
            
            map = null; //다 사용하면 메모리 비우기
        }
        
        //List 저장된 데이터 수
        int listSize = list.size();
        
        System.out.println("저장된 데이터 수 : " + listSize);
    
        System.out.println("\n\n1세대 반복문\n");
        for (int i = 0; i < listSize; i++) {
            Map<String, String> rMap = list.get(i);
            
            System.out.println("name : " + rMap.get("name"));
            System.out.println("name : " + rMap.get("email"));
            System.out.println("name : " + rMap.get("dept"));
            
            rMap = null;    //다 사용하면 메모리 비우기
        }
        
        System.out.println("\n\n2세대 반복문\n");
        for (Map<String, String> rMap :
                list) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("name : " + rMap.get("email"));
            System.out.println("name : " + rMap.get("dept"));
            rMap = null;
        }
    
        System.out.println("\n\n3세대 반복문\n");
        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("name : " + rMap.get("email"));
            System.out.println("name : " + rMap.get("dept"));
            rMap = null;
        });
    
    
        System.out.println("\n\n4세대 반복문\n");
        list.parallelStream().forEach(rMap -> {
            
            System.out.println("name : " + rMap.get("name"));
            System.out.println("name : " + rMap.get("email"));
            System.out.println("name : " + rMap.get("dept"));
            rMap = null;
        });
        
        System.out.println("\n\n1.5세대 반복문\n");
        
        Iterator<Map<String, String>> it = list.iterator();
        
        while (it.hasNext()) {
            Map<String, String> rMap = it.next();
            
            System.out.println("name : " + rMap.get("name"));
            System.out.println("name : " + rMap.get("email"));
            System.out.println("name : " + rMap.get("dept"));
            
            rMap = null;
        }
    }
}
