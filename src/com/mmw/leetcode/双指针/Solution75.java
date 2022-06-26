package com.mmw.leetcode.双指针;

import java.util.Arrays;

public class Solution75 {
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i < right && nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[right];
                nums[right] = tmp;
                right -= 1;
            }
            //这里的等号需要加上
            if (i >= left && nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[left];
                nums[left] = tmp;
                left += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sortColors(new int[]{0,1,0});
        sortColors(new int[]{2, 0, 2, 1, 1, 0});

    }
}
