package com.mmw.jianzhiofffer.分治算法;

public class Solution53_2 {
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == mid) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,2,3,5}));
    }

}
