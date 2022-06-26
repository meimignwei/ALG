package com.mmw.leetcode.模拟法;

import java.util.HashMap;
import java.util.Map;

public class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        int max_vale = 0;
        int max_count = 0;
        for (int i = 0; i < tasks.length; i++) {
            int tmp = map.getOrDefault(tasks[i], 0)+1;
            map.put(tasks[i], tmp);
            max_vale = Math.max(max_vale, tmp);
        }
        for (char a : map.keySet()) {
            if (map.get(a) == max_vale) {
                max_count += 1;
            }
        }
        return Math.max((max_vale - 1) * (n + 1) + max_count, tasks.length);

    }

}
