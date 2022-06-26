package com.mmw.jianzhiofffer.分治算法;

import java.util.Arrays;

public class Solution51 {
    public static int reversePairs(int[] nums) {
        if (nums.length <= 1) return 0;
        return merge(nums,0, nums.length - 1);
    }

    private static int merge(int[] nums,int l, int r) {
        if(l >= r) return 0;
        int mid = (l + r) / 2;
        int res = merge(nums, l, mid) + merge(nums,mid + 1, r);
        int[] temp = new int[r - l + 1];
        for (int a = l; a <= r ; a++) {
            temp[a - l] = nums[a];
        }

        int i = 0, j = mid + 1-l;
        for (int k = l; k <= r; k++) {
            if (i == mid + 1 - l) nums[k] = temp[j++];
            else if (j == r-l+1 || temp[i] <= temp[j]) nums[k] = temp[i++];
            else {
                nums[k] = temp[j++];
                res += mid - i + 1-l;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println((reversePairs(new int[]{1,3,2,5,6,8})));
    }
}
