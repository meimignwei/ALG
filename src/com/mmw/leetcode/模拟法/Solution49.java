package com.mmw.leetcode.模拟法;

import java.util.*;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tmp = String.valueOf(temp);
            List<String> list = map.getOrDefault(tmp, new ArrayList<>());
            list.add(strs[i]);
            map.put(tmp, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
