package src.com.mmw.jianzhi;

import java.util.*;
/*
* 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
* 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
* */
public class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] res = new int[set.size()];
        int index = 0;
        for (Integer a : set) {
            res[index++] = a;
        }
        return res;
    }
}
