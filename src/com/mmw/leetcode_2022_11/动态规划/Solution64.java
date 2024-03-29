package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int clo = grid[0].length;
        int[][] dp = new int[row][clo];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < clo; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < clo; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[row - 1][clo - 1];
    }

    public static void main(String[] args) {
        Solution64 s = new Solution64();
        System.out.println(s.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

}
