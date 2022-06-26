package com.mmw.leetcode.list.重复元素删除;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow += 1;
            }
        }
        return slow;
    }
}
