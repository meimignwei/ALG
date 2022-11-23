package src.com.mmw.jianzhi.回溯;

public class Solution12 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        int row = board.length;
        int clo = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i,j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j,  int k) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 ||
        board[i][j] != word.charAt(k)) {
            return false;
        }
        if (word.length() - 1 == k) {
            return true;
        }
        //防止回溯到之前的字符
        board[i][j] = '0';
        boolean flag =  dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) ||
                dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word.charAt(k);
        return flag;
    }
}
