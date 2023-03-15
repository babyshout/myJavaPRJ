package exam.codetest_exam;

class Solution_92344 {
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;

//        [type(1공격, 2회복), r1(첫번째배열x), c1(첫번째배열y)
//                , r2(첫번째배열x), c2(첫번째배열y)y, degree(공격이나회복횟수)]

        for (int i = 0; i < skill.length; i++) {
            if (skill[i][0] == 1){
                for (int j = skill[i][1]; j <= skill[i][3]; j++) {
                    for (int k = skill[i][2]; k <= skill[i][4]; k++) {
                        board[j][k] -= skill[i][5];
                    }
                }
            } else {
                for (int j = skill[i][1]; j <= skill[i][3]; j++) {
                    for (int k = skill[i][2]; k <= skill[i][4]; k++) {
                        board[j][k] += skill[i][5];
                    }
                }
            }
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0)
                    answer++;
            }
        }

        return answer;
    }

    public int isInputCorrect(int[][] board, int[][] skill) {
        int answer = 0;

        System.out.printf("\nboard\n");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nskill\n");
        for (int i = 0; i < skill.length; i++) {
            for (int j = 0; j < skill[i].length; j++) {
                System.out.printf("%d ", skill[i][j]);
            }
            System.out.printf("\n");
        }



        return answer;
    }
}



public class Cote_92344 {

    public static void main(String[] args) {
        int[][][] boardInput =
                {{{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}},
                        {{1,2,3},{4,5,6},{7,8,9}}};
        int[][][] skillInput = {{{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}},
                {{1,1,1,2,2,4},{1,0,0,1,1,2},{2,2,0,2,0,100}}};

        Solution_92344 sol = new Solution_92344();


        for (int i = 0; i < boardInput.length; i++) {
            System.out.printf("\n%d \n", i);
            sol.isInputCorrect(boardInput[i], skillInput[i]);
        }

        System.out.printf("\n\n\n\nsol.solution\n");

        for (int i = 0; i < boardInput.length; i++) {
            System.out.printf("%d\n", sol.solution(boardInput[i], skillInput[i]));
        }




    }

}
