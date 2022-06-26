package com.mmw.leetcode.二分查找;

import javafx.scene.web.WebHistory;

import java.util.Arrays;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res,-1);
        if (nums.length == 0) return res;
        int tmp = search(nums,target);
        if (nums[tmp] != target) {
            return res;
        } else {
            int left = tmp;
            int right = tmp;
            while (left >= 0 && nums[left] == target) left -= 1;
            while (right < nums.length && nums[right] == target) right += 1;
            res[0] = left + 1;
            res[1] = right - 1;
        }
        return res;

    }

    private static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1},1));
    }

}
