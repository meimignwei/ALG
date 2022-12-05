package src.com.mmw.leetcode_2022_11.动态规划;

import java.util.*;
public class Solution416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        Arrays.sort(nums);
        if (sum % 2 != 0) return false;
        boolean[][] dp = new boolean[nums.length][sum / 2+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= sum/2; j++) {
                if (nums[i] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[nums.length-1][sum / 2];
    }

    public static void main(String[] args) {
        Solution416 s = new Solution416();
        System.out.println(s.canPartition(new int[]{1,5,11,5}));
    }

}
