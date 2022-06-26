package com.mmw.leetcode.动态规划;

/*
* 0表示股票在手
* 1表示处于冷冻期
* 2表示股票没有
* */

public class Solution309 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                dp[0][0] = -prices[0];
                dp[0][1] = 0;
                dp[0][2] = 0;
            } else {
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);
                dp[i][1] = dp[i - 1][0] + prices[i];
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
            }
        }
        return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]);
    }

}
