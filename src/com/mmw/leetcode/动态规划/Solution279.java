package com.mmw.leetcode.动态规划;

import java.util.Arrays;

public class Solution279 {
    public static int numSquares(int n) {
        int mid = n / 2;
        int[] dp = new int[n + 1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= mid ; j++) {
                if (i == j*j) dp[i] = 1;
                else if (i - (j * j) > 0) {
                    dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

}
