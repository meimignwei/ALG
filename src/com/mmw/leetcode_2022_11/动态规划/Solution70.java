package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution70 s = new Solution70();
        System.out.println(s.climbStairs(3));
    }
}
