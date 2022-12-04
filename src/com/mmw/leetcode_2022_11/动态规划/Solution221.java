package src.com.mmw.leetcode_2022_11.动态规划;

import java.util.*;
public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int clo = matrix[0].length;
        int[][] dp = new int[row][clo];
        int res = 0;
        Arrays.fill(dp,0);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                    res = Math.max(res, dp[i][j]*dp[i][j]);
                }
            }
        }
        return res;
    }

}
