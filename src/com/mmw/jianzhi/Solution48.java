package src.com.mmw.jianzhi;
/*
重点关注
* */
import java.util.*;
public class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int j = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //注意这里需要是判断j,比如"baab"，此时j为2，而不是0
                j  = Math.max(map.get(s.charAt(i)),j);
            }
            max = Math.max(max, i - j);
            map.put(s.charAt(i), i);
        }
//        System.out.println(map);
        return max;
    }

    public static void main(String[] args) {
        Solution48 s = new Solution48();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}
