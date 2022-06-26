package com.mmw.jianzhiofffer;

public class Solution53_1 {
    public int search(int[] nums, int target) {
        int account = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) account += 1;
        }
        return account;
    }
}
