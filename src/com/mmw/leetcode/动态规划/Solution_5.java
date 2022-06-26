package com.mmw.leetcode.动态规划;

import java.util.Arrays;

public class Solution_5 {
    public static String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if ( i == j) dp[i][j] = true;
                else if (j-i==1) dp[i][j] = s.charAt(i) == s.charAt(j);
                else dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                if (dp[i][j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));
    }


}
