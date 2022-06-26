package com.mmw.leetcode.动态规划;

import java.util.*;

public class Solution139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j, i))) {
                    if (dp[j]) {
                        dp[i] = dp[j];
                        break;
                    }
                }
            }

        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        String s = "dogs";
        System.out.println(s.substring(0,3));
        List<String> stringList = Arrays.asList("dog","s","gs");
        System.out.println(wordBreak(s,stringList));
    }

}
