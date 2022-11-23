package src.com.mmw.jianzhi;

import java.util.*;
/*
* 剑指 Offer 50. 第一个只出现一次的字符
 */
public class Solution50 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        if (s.length() == 0) {
            return ' ' ;
        }
        char res = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                Integer temp = map.get(s.charAt(i));
                map.put(s.charAt(i), temp+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) {
                res =  s.charAt(i);
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution50 s = new Solution50();
        System.out.println(s.firstUniqChar("abaccdeff"));
    }
}
