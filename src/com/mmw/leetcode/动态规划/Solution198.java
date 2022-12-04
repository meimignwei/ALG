package src.com.mmw.leetcode.动态规划;

/*
* 需要知道dp的每一个位置都是存储的是最大偷窃金额
* */
public class Solution198 {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (nums.length == 1) return nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        int res = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,1,1,2}));
    }
}
