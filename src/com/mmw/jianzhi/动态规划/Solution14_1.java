package src.com.mmw.jianzhi.动态规划;

public class Solution14_1 {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        if (n == 2) return 1;
        for (int i = 3; i < n+1; i++) {
            dp[i] = 1;
        }
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j) * j));
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution14_1 s = new Solution14_1();
        System.out.println(s.cuttingRope(120));
    }

}
