package com.mmw.leetcode.动态规划;

import java.util.Arrays;

public class Solution97 {
    public static boolean isInterleave(String s1, String s2, String s3) {
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        dp[0][0] = true;
//        int len1 = s1.length();
//        int len2 = s2.length();
//        int len3 = s3.length();
        if (s3.length() != (s1.length() + s2.length())) {
            return false;
        }
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j-1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i-1) == s3.charAt(i + j -1))
                        || (dp[i][j - 1] && s2.charAt(j-1) == s3.charAt(i + j -1));
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
    }
}
