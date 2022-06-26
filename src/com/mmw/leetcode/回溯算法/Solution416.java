package com.mmw.leetcode.回溯算法;

public class Solution416 {
    boolean flag = false;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        } else {
            dfs(sum / 2, 0, nums);
        }
        return flag;
    }

    private void dfs(int target, int i, int[] nums) {
        if (target == 0){
            flag = true;
            return;
        }
        if (i > nums.length) return;
        dfs(target, i+1, nums);
        if (target - nums[i] >= 0) {
            dfs(target-nums[i], i+1, nums);
        }

    }

}
