package com.mmw.leetcode.模拟法;

public class Solution31 {
    public static void nextPermutation(int[] nums) {
        int len = nums.length-1;
        int tmp = -1;
        int refer = -1;
        for (int i = len; i > 0; i--) {
            //第一个满足条件的索引，需要break
            if (nums[i - 1] < nums[i]) {
                tmp = i - 1;
                refer = i;
                break;
            }
        }
        if (tmp == -1) {
            reverse(nums,0,nums.length-1);
        } else {
            int r = len;
            //这里存在相同的数字
            while (nums[r] <= nums[tmp]) {
                r -= 1;
            }
            int temp = nums[tmp];
            nums[tmp] = nums[r];
            nums[r] = temp;
            reverse(nums,refer,len);
        }

    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left += 1;
            right -= 1;
        }
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{1,5,1});
    }
}
