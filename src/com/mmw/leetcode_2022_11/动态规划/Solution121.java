package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }
}
