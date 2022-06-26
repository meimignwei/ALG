package com.mmw.leetcode.动态规划;

public class Solution647 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    dp[j][i] = true;
                    count += 1;
                } else if (i - j < 2 && s.charAt(i) == s.charAt(j)) {
                    dp[j][i] = true;
                    count += 1;
                } else if (dp[j+1][i-1] && s.charAt(i) == s.charAt(j)) {
                    dp[j][i] = true;
                    count += 1;
                }
            }
        }
        return count;
    }

}
