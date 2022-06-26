package com.mmw.leetcode.模拟法;

import java.util.Arrays;

public class Solution287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                ans = nums[i];
        }
        return ans;
    }

}
