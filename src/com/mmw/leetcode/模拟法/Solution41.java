package com.mmw.leetcode.模拟法;

import java.util.Arrays;

public class Solution41 {
    public static int firstMissingPositive(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 + i) {
                res =  i + 1;
                break;
            }
        }
        if (res == -1) return nums.length + 1;
        else return res;
    }

    private static void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}
