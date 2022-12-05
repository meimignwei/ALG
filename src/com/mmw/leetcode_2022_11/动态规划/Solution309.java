package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution309 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][3];
        //[0]表示持有股票
        //[1]表示处于冷冻期
        //[2]表示不持有股票,是冷冻期之后的状态

        dp[0][0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }
        return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]);
    }

    public static void main(String[] args) {
        Solution309 s = new Solution309();
        System.out.println(s.maxProfit(new int[]{1,2,3,0,2}));
    }

}
