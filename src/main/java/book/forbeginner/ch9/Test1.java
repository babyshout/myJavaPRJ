package book.forbeginner.ch9;

public class Test1 {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        
        //문제 IP만 출력하기
        System.out.println(log.substring(0, log.indexOf(" ")));
        String[] strArr = log.split(" ");
        System.out.println(strArr[0]);
        
        //교수님
        String[] ip = log.split(" ");
        System.out.println(ip[0]);
        
        //문제 호출날짜와 시간만 출력하기
        String[] strArr2 = log.split("\"");
        System.out.println(log.substring(log.indexOf("["), log.indexOf("]") + 1));
//        for (int i = 0; i < strArr.length; i++) {
//            if (strArr[i].startsWith("[")) {
//                System.out.println(strArr[i]);
//                break;
//            }
//        }
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i].contains("[")) {
                System.out.println(strArr2[i].substring(strArr2[i].indexOf("["), strArr2[i].indexOf("]") + 1));
                break;
            }
        }
        
        //교수님
        ip = log.split(" ");
        System.out.println("시간 : " + ip[3]);    //시간 : [12/Apr/2018:17:03:50
        String time;
        time = ip[3].replace("[", "");
        
        System.out.println("시간 : " + time);
        
    }
}
