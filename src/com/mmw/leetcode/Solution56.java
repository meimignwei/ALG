package com.mmw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0 || list.get(list.size() - 1)[1] < intervals[i][0]) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                list.get(list.size() - 1)[1] = Math.max(intervals[i][1], list.get(list.size() - 1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

}
