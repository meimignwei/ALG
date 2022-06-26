package com.mmw.leetcode.回溯算法;

public class Solution494 {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int target, int i, int tmp) {
        if (tmp == target && i == nums.length) {
            count += 1;
        }
        if (i > nums.length) return;
        dfs(nums,target,i+1,tmp-nums[i]);
        dfs(nums,target,i+1,tmp+nums[i]);
    }

}
