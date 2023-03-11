package practice;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        int answer = 0;

        System.out.println(s);

        int isSame = 0;
        int isNotSame = 0;

        char ch = ' ';

        for (int i = 0; i < s.length(); i++) {

            if (isSame == isNotSame || ch == ' ') {
                isSame = 1;
                isNotSame = 0;
                ch = s.charAt(i);

                answer++;

                continue;

            }

            if (s.charAt(i) == ch)
                isSame++;
            else
                isNotSame++;

        }




        return answer;
    }
}

public class Cote_140108 {

    public static void main(String[] args) {


        List<String> listStr = new ArrayList<>();

        listStr.add("banana");
        listStr.add("abracadabra");
        listStr.add("aaabbaccccabba");

        for (String str :
                listStr) {

            Solution solution = new Solution();

            System.out.println(solution.solution(str));

        }
        
    }


}
