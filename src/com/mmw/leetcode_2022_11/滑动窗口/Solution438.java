package src.com.mmw.leetcode_2022_11.滑动窗口;

import java.util.*;
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count_s = new int[26];
        int[] count_p = new int[26];
        List<Integer> ans = new ArrayList<Integer>();
        //注意s的长度会大于p的长度。
        if (p.length() > s.length()) return ans;
        for (int i = 0; i < p.length(); i++) {
            count_s[p.charAt(i) - 'a'] += 1;
            count_p[p.charAt(i) - 'a'] += 1;
            if (Arrays.equals(count_p, count_s)) {
                ans.add(0);
            }
        }
        for (int i = 0; i < s.length()-p.length(); i++) {
            count_s[s.charAt(i) - 'a'] -= 1;
            count_s[s.charAt(i + p.length()) - 'a'] += 1;
            if (Arrays.equals(count_p, count_s)) {
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution438 s = new Solution438();
        System.out.println(s.findAnagrams("cbaebabacd","abc"));
    }
}
