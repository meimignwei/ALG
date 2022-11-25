package src.com.mmw.leetcode_2022_11.字符串;

import java.util.*;
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int index = -1;
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (map.size() > 0 && map.containsKey(s.charAt(i))) {
                index = Math.max(index, map.get(s.charAt(i)));
                map.put(s.charAt(i), i);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - index);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}
