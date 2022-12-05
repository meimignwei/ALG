package src.com.mmw.leetcode_2022_11.动态规划;

import java.util.*;
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            res = Math.max(dp[i], res);
        }
//        System.out.println(Arrays.toString(dp));
        return res;

    }

    public static void main(String[] args) {
        Solution300 s = new Solution300();
        System.out.println(s.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
    }
}
