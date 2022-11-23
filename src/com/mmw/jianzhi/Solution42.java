package src.com.mmw.jianzhi;

public class Solution42 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length + 1];
        if (nums.length == 1) return nums[0];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i-1];
            } else {
                dp[i] = dp[i - 1] + nums[i - 1];
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
