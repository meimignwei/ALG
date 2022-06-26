package com.mmw.leetcode.list.重复元素删除;

public class Solution80_删除有序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 1) return 1;
        int i = 0;
        int start = 0;
        int pos = 0;
        while (pos < nums.length) {
            while (pos < nums.length && nums[start] == nums[pos]) {
                pos += 1;
            }
            if (pos - start >= 2) {
                count += 2;
            } else {
                count += 1;
            }
            start = pos;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

}
