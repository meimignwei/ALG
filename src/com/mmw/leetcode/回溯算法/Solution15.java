package com.mmw.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return res;
            if (nums[i] == nums[i-1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                List<Integer> tmp = new ArrayList<>();
                if (nums[i] + nums[l] + nums[r] == 0) {
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    res.add(tmp);
                    while (l < r && nums[l] == nums[l + 1]) {
                        l += 1;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r -= 1;
                    }
                    l += 1;
                    r -= 1;
                }
                else if (nums[i] + nums[l] + nums[r] > 0) r -= 1;
                else l += 1;
            }
        }
        return res;
    }
}
