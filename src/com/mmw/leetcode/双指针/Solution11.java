package com.mmw.leetcode.双指针;

public class Solution11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                res = Math.max((right - left) * Math.min(height[left], height[right]), res);
                left += 1;
            } else {
                res = Math.max((right - left) * Math.min(height[left], height[right]), res);
                right -= 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
