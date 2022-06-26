package com.mmw.leetcode.动态规划;

public class Solution300 {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    res = Math.max(dp[i], res);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

}
