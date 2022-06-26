package com.mmw.leetcode.双指针;

public class Solution560 {
    public static int subarraySum(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        while (l <= r && r < nums.length) {
            if (r < nums.length && sum < k) {
                sum += nums[r];
                r += 1;
            }
            if (l < nums.length && sum > k) {
                sum -= nums[l];
                l += 1;
            }
            if (l <= r && l < nums.length && sum == k) {
                count += 1;
                sum -= nums[l];
                l += 1;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(subarraySum(new int[]{1},0));
    }

}
