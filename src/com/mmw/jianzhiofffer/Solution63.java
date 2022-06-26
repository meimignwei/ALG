package com.mmw.jianzhiofffer;

public class Solution63 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int minValue = prices[0];
        int[] dp = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) minValue = prices[i];
            dp[i] = prices[i] - minValue;
        }
        return max(dp);
    }

    private static int max(int[] dp) {
        int max = dp[0];
        for (int i = 0; i < dp.length;i++) {
            if (dp[i] > max) max = dp[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {6,5,4,3,2,1};
        System.out.println(maxProfit(a));
    }
}
