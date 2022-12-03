package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution136 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        Integer res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        if (set.size() == 1) {
            for (Integer ele : set) {
                res =  ele;
            }
        }
        return res;
    }
}
