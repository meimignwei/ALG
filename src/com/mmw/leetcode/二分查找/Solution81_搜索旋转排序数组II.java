package com.mmw.leetcode.二分查找;

public class Solution81_搜索旋转排序数组II {
    public static boolean search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] == nums[left] &&  nums[left] == nums[right]) {
                return searchTarget(nums, target);
            }
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        if (nums[left] == target) return true;
        return false;
    }

    private static boolean searchTarget(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,1},1));
    }
}
