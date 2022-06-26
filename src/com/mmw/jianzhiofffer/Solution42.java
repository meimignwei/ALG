package com.mmw.jianzhiofffer;

public class Solution42 {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1] < 0) dp[i] = nums[i];
            else dp[i] = dp[i - 1] + nums[i];
        }
        return maxValue(dp);
    }

    private static int maxValue(int[] dp) {
        int maxValue = dp[0];
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > maxValue) maxValue = dp[i];
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] temp = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(temp));
    }
}
