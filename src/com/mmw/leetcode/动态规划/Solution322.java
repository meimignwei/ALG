package com.mmw.leetcode.动态规划;

import java.util.Arrays;

public class Solution322 {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = coins.length - 1; j >= 0; j--) {
                if (i == coins[j]) dp[i] = 1;
                else if (i > coins[j]) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        if (dp[amount] == amount+1) return -1;
        else return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }

}
