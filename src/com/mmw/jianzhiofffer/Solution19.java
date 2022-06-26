package com.mmw.jianzhiofffer;

public class Solution19 {
    public boolean isMatch(String s, String p) {
        int m = s.length()+1;
        int n = p.length()+1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        for (int i = 2; i < n ; i += 2) {
            if (p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i - 2];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (p.charAt(j-1) != '*'){
                    if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }else{
                    if (p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1)){
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 2];
                    }else{
                        dp[i][j] = dp[i][j - 2];
                    }
                }

            }

        }
        return dp[m-1][n-1];
    }

}
