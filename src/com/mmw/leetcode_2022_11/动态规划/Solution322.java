package src.com.mmw.leetcode_2022_11.动态规划;
/*
* 这道题和完全平方数是类似的，重点关注！
* */
import java.util.*;
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        //判断是否可以找0的依据
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        //判断是否可以找零
        if (dp[amount] == amount + 1) {
            return -1;
        } else {
            return dp[amount];
        }
    }

    public static void main(String[] args) {
        Solution322 s = new Solution322();
        System.out.println(s.coinChange(new int[]{1, 2, 5},11));
    }



}
