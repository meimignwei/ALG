package com.mmw.jianzhiofffer;

public class Solution49 {
    public static int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[a] * 2, Math.min(dp[b] * 3, dp[c] * 5));
            if (dp[a]*2 == dp[i]) a += 1;
            if (dp[b]*3 == dp[i]) b += 1;
            if (dp[c]*5 == dp[i]) c += 1;
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

}
