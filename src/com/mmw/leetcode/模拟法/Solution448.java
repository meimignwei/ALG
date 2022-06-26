package com.mmw.leetcode.模拟法;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i < nums.length+1; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

}
