package book.bible2nd.ch9langpackage.part2String;

public class StringEx9 {
    
    public static void main(String[] args) {
        
        String fileName = "Hello.java";
        
        // fullName에서 '.'의 위치를 찾는다.
        int index = fileName.indexOf('.');
        
        // '.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
        // fullName.substring(index+1, fullName.length());의 결과와 같다.
        String ext = fileName.substring(index + 1);
        
        
        System.out.println(fileName + "의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fileName + "의 확장자는 " + ext);
        
    }
}
