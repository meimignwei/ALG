package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && nums[left] == tmp[left]) {
                left++;
            }
            while (right > 0 && nums[right] == tmp[right]) {
                right--;
            }
            break;
        }
        if (right - left + 1 < 0) {
            return 0;
        } else {
            return right - left + 1;
        }
    }

    public static void main(String[] args) {
        Solution581 s = new Solution581();
        System.out.println(s.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
    }
}
