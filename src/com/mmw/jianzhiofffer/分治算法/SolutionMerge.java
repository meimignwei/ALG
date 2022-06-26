package com.mmw.jianzhiofffer.分治算法;

import java.util.Arrays;

public class SolutionMerge {
    public static  int[] mergeSort(int[] nums, int l, int r){
        if (nums.length == 0) return nums;
        if (l >= r) return nums;
        int m = (l + r) / 2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        int[] temp = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            temp[i - l] = nums[i];
        }
        int left = 0;
        int right = m-l+1;
        for (int i = l; i <= r ; i++) {
            if (left == m-l+1) nums[i] = temp[right++];
            else if (right == r-l+ 1 || temp[left] <= temp[right]) nums[i] = temp[left++];
            else nums[i] = temp[right++];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{0, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(temp, 0, temp.length-1)));
    }
}
