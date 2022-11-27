package src.com.mmw.leetcode_2022_11.动态规划;

import java.util.Arrays;
/*
重点关注
* dp[i] = (dp[j] && ((j + nums[j]) >= i)) || dp[i];这个表示只要有一个满足要求就认为是满足要求的
* */
public class Solution55 {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j]) {
                    dp[i] = (dp[j] && ((j + nums[j]) >= i)) || dp[i];
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        Solution55 s = new Solution55();
        System.out.println(s.canJump(new int[]{2,0,0}));
    }

}
