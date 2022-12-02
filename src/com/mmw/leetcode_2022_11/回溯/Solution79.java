package src.com.mmw.leetcode_2022_11.回溯;

public class Solution79 {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int clo = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, board, row, clo, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, int row, int clo, String word, int start) {
        if (i >= row || i < 0 || j >= clo || j < 0 || board[i][j] != word.charAt(start)) {
            return false;
        }
        if (start == word.length()-1) {
            return true;
        }
        board[i][j] = '0';
        boolean flag = false;
        flag =  dfs(i - 1, j, board, row, clo, word, start+1) ||
                dfs(i, j - 1, board, row, clo, word, start+1) ||
                dfs(i + 1, j, board, row, clo, word, start+1) ||
                dfs(i, j + 1, board, row, clo, word, start+1);
        board[i][j] = word.charAt(start);
        return flag;
    }
}
