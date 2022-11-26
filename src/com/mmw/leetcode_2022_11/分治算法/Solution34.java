package src.com.mmw.leetcode_2022_11.分治算法;

import java.util.*;
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int temp = -1;
        int[] res = new int[2];
        Arrays.fill(res,-1);
        //注意边界条件
        if (nums.length == 0) {
            return res;
        }
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                temp = mid;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (nums[l] == target) {
            temp = l;
        }
        if (temp == -1) {
            return res;
        } else {
            int left = temp;
            int right = temp;
            while (left >= 0 && nums[left] == target) {
                left--;
            }
            while (right < nums.length && nums[right] == target) {
                right++;
            }
            res[0] = left + 1;
            res[1] = right - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution34 s = new Solution34();
        System.out.println(Arrays.toString(s.searchRange(new int[]{1}, 2)));
    }

}
