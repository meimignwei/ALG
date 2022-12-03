package src.com.mmw.leetcode_2022_11.动态规划;

import java.util.*;
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<String>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j, i))) {
                    dp[i] = dp[j] || dp[i];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        Solution139 s = new Solution139();
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("leet");
        wordDict.add("code");
        String temp = "leetcode";
        System.out.println(temp.substring(4,8));

        System.out.println(s.wordBreak("leetcode",wordDict));
    }

}
