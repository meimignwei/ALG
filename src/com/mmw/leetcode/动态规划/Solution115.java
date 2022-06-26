package com.mmw.leetcode.动态规划;

import java.util.Arrays;

public class Solution115 {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        Arrays.fill(dp,0);
        for (int i = 0; i < s.length()+1; i++) {
            dp[i][t.length()+1] = 1;
        }
        for (int i = s.length()-1; i >= 0 ; i--) {
            for (int j = t.length()-1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
}
