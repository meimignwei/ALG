package com.mmw.jianzhiofffer;

import java.util.HashSet;
class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0;i < nums.length;++i){
            if (hashSet.contains(nums[i])) {
                return nums[i];
            } else {
                hashSet.add(nums[i]);
            }
        }
        return -1;
    }
}
