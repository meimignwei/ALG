package com.mmw.leetcode.模拟法;

import java.util.Arrays;

public class Solution581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        Arrays.sort(tmp);
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while (left < right) {
            while (left < right && tmp[left] == nums[left]) {
                left += 1;
            }
            while (left < right && tmp[right] == nums[right]) {
                right -= 1;
            }
            if (tmp[left] != nums[left] && tmp[right] != nums[right]) {
                ans = right - left + 1;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
    }

}
