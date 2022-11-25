package src.com.mmw.leetcode_2022_11.动态规划;

public class Solution5 {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        String res = "";
        dp[0][0] = true;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) dp[i][j] = true;
                else if (j - i == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j]) {
                    if (j - i + 1 > res.length()) {
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }
}
