package com.mmw.jianzhiofffer;

import java.util.Arrays;

public class Solution57 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (nums[left] + nums[right] == target) {
                result[0] = nums[left];
                result[1] = nums[right];
                break;
            }
            else if(nums[left] + nums[right] < target){
                left += 1;
            }else{
                right -= 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(temp, 9)));
    }
}
