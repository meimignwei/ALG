package com.mmw.leetcode.模拟法;

import java.util.ArrayList;
import java.util.List;

public class Solution59_插入区间 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean flag = false;
        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] > right) {
                if (!flag) {
                    ans.add(new int[]{left, right});
                    flag = true;
                }
                ans.add(interval);
            } else if (interval[1] < left) {
                ans.add(interval);
            } else {
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }
        if (!flag) {
            ans.add(new int[]{left, right});
        }
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

}
