package com.mmw.jianzhiofffer;

import java.util.HashMap;

public class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> dict = new HashMap<>();
        int res = 0;
        int i = -1;
        for (int j = 0; j < s.length(); j++) {
            if (dict.containsKey(s.charAt(j))){
                i = Math.max(i, dict.get(s.charAt(j)));
            }
            dict.put(s.charAt(j), j);
            res = Math.max(res, j - i);
        }
        return res;
    }
}
