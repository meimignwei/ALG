package src.com.mmw.leetcode_2022_11.动态规划.回文串;

import java.util.*;
public class Solution647 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {
                    dp[i][j] = true;
                } else if (j - i == 1 && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j]) {
                    ans += 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution647 s = new Solution647();
        System.out.println(s.countSubstrings("aaa"));
    }
}
