package com.mmw.leetcode.list.重复元素删除;

public class Solution28 {
    public int removeDuplicates(int[] nums) {
        int repeate = 1;
        int slow = repeate -1;
        for(int fast = repeate;fast < nums.length;fast++){
            if(nums[slow-repeate+1] != nums[fast]){
                slow ++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
