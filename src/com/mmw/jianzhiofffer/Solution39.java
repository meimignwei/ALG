package com.mmw.jianzhiofffer;

import java.util.HashMap;
import java.util.Map;

public class Solution39 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = nums[0];
        for (int num:nums) {
            if (map.containsKey(num)) {
                int tmp = map.get(num);
                map.put(num, tmp + 1);
                if (map.get(num) > (nums.length / 2)) {
                    res = num;
                }
            }else{map.put(num, 1);}
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{6,6,6,7,7}));
    }

}
