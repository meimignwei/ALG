package com.mmw.jianzhiofffer;

import java.util.HashSet;
import java.util.Set;

public class Solution03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) result = nums[i];
            else{
                set.add(nums[i]);
            }
        }
        return result;
    }
}
