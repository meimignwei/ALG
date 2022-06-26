package com.mmw.jianzhiofffer;


import java.util.HashMap;
import java.util.Map;

public class Solution50 {
    public static char firstUniqChar(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
            }else {
                hashMap.put(s.charAt(i), 1);}
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }

        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
