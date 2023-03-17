package exam.codetest_exam;

public class test {
    public static void main(String[] args) {
        test t = new test();
        int[][] board =
                {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
        int[][] skill = {{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};

        t.solution(board,skill);
    }
    public int solution(int[][] board, int[][] skill) {

        int answer = 0;
        int n = board.length; // 세로
        int m = board[0].length; // 가로

        for (int [] s : skill) {
            int type = s[0]; // 스킬 타입
            int r1 = s[1]; // 시작하는 배열 세로 x
            int c1 = s[2]; // 시작하는 배열 가로 y
            int r2 = s[3]; // 끝나는 배열 세로 x
            int c2 = s[4]; // 끝나는 배열 가로 y

        }

        return answer;
    }
}
