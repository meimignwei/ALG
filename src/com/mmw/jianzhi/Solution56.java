package src.com.mmw.jianzhi;

import java.util.*;
public class Solution56 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int temp = map.get(nums[i]);
                map.put(nums[i], temp + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int res = nums[0];
        for (Integer a : map.keySet()) {
            if (map.get(a) == 1) {
                res = a;
            }
        }
        return res;
    }
}
