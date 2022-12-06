package src.com.mmw.leetcode_2022_11.滑动窗口;

/*
* 这道题有暴力解法，两遍遍历
* */

import java.util.*;
public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution560 s = new Solution560();
        System.out.println(s.subarraySum(new int[]{1,1,1},2));
    }
}
