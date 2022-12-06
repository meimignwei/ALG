package src.com.mmw.leetcode_2022_11.数学.模拟;

import java.util.*;
public class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < tasks.length; i++) {
            int tmp = map.getOrDefault(tasks[i], 0) + 1;
            map.put(tasks[i],  tmp);
            count = Math.max(count, tmp);
        }
        int ans = 0;
        for (Character c : map.keySet()) {
            if (count == map.get(c)) {
                ans += 1;
            }
        }
        //这里比较关键
        return Math.max((count - 1) * (n + 1) + ans,tasks.length);
    }

    public static void main(String[] args) {
        Solution621 s = new Solution621();
        System.out.println(s.leastInterval(new char[]{'A','A','A','B','B','B'},0));
    }


}
