package com.mmw.leetcode.模拟法;

public class Solution42 {
    public static int trap(int[] height) {
        int left = height[0];
        int right = height[height.length - 1];
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            if (height[l] < height[r]) {
                left = Math.max(left, height[l]);
                res = res + (left - height[l]);
                l += 1;
            } else {
                right = Math.max(right, height[r]);
                res = res + (right - height[r]);
                r -= 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

}
