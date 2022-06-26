package com.mmw.leetcode.动态规划;

public class Solution152 {
    public int maxProduct(int[] nums) {
        int[] dp_max = new int[nums.length];
        int[] dp_min = new int[nums.length];
        int res = nums[0];
        dp_max[0] = nums[0];
        dp_min[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp_max[i] = Math.max(dp_max[i - 1] * nums[i], Math.max(nums[i], dp_min[i - 1] * nums[i]));
            dp_min[i] = Math.min(dp_max[i - 1] * nums[i], Math.min(nums[i], dp_min[i - 1] * nums[i]));
        }
        for (int i = 0; i < dp_max.length; i++) {
            res = Math.max(dp_max[i],res);
        }
        return res;
     }

}
