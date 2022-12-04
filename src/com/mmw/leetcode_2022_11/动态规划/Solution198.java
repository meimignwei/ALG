package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[nums.length];
    }

    public static void main(String[] args) {
        Solution198 s = new Solution198();
        System.out.println(s.rob(new int[]{2,7,9,3,1}));
    }


}
