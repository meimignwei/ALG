package com.mmw.leetcode.模拟法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            int l = interval[0];
            int r = interval[1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < l) {
                res.add(new int[]{l, r});
            } else if (res.get(res.size() - 1)[1] > l) {
                res.get(res.size() - 1)[1] = Math.max(r, res.get(res.size() - 1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new int[][]{{3, 9}, {2, 6}, {8, 10}, {15, 18}}));
    }

}
