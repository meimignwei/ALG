package src.com.mmw.leetcode_2022_11.数学;

import java.util.Arrays;

public class Solution279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i ; j++) {
                if ((i - j * j) >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                } else {
                    dp[i] = dp[i];
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        Solution279 s = new Solution279();
        System.out.println(s.numSquares(12));
    }

}
