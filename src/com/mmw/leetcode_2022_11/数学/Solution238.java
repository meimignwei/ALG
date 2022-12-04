package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
//        System.out.println(Arrays.toString(res));
        int temp = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            //关键
            temp *= nums[i+1];
            res[i] = res[i] * temp;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution238 s = new Solution238();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
