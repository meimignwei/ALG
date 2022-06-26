package com.mmw.jianzhiofffer;

import java.util.Arrays;

public class Solution21 {
    public static int[] exchange(int[] nums) {
        if (nums.length == 0) return nums;
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (right - left <= 1) break;
            while (left < right && nums[left] % 2 == 1){
                left += 1;
            }
            while (left < right && nums[right] % 2 == 0){
                right -= 1;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4};
        System.out.println(Arrays.toString(exchange(temp)));
    }
}
