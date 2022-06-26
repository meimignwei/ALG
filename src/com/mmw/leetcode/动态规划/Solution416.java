package com.mmw.leetcode.动态规划;

public class Solution416 {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        boolean[][] dp = new boolean[nums.length][sum / 2+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= sum/2; j++) {
                if (nums[i] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        return dp[nums.length - 1][sum / 2];
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{3,3,3,4,5}));
    }

}
