package com.mmw.jianzhiofffer.搜索与回溯算法;

public class Solution12 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        int row = board.length;
        int clo = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board,word,0,i,j)) return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int k, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) {
            return false;
        }
        if (k == word.length()-1){
            return true;
        }
        boolean flag = false;
        board[i][j] = '0';
        flag = dfs(board, word, k + 1, i - 1, j)
                || dfs(board, word, k + 1, i + 1, j)
                || dfs(board, word, k + 1, i, j - 1)
                || dfs(board, word, k + 1, i, j + 1);
        board[i][j] = word.charAt(k);
        return flag;
    }
}
