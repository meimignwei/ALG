package com.mmw.jianzhiofffer;

public class Solution53_3 {
    public int missingNumber(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                result = i;
                break;
            }
        }
        if(result == -1) return nums.length;
        else return result;
    }
}
