package com.mmw.leetcode.动态规划;

import java.util.Arrays;

public class Solution45_2 {
    public static int jump(int[] nums) {
        int res = nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,nums.length);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j <= nums[j]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
}
