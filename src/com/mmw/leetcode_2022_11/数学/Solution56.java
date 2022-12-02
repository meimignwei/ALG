package src.com.mmw.leetcode_2022_11.数学;

import java.util.*;
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        if (intervals.length == 0) {
            return new int[0][0];
        }
        List<int[]> res = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0) {
                res.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                if (res.get(res.size() - 1)[1] < intervals[i][0]) {
                    res.add(new int[]{intervals[i][0], intervals[i][1]});
                } else {
                    res.get(res.size() - 1)[1] = Math.max(intervals[i][1], res.get(res.size() - 1)[1]);
                }
            }

        }
        return res.toArray(new int[res.size()][2]);
    }

    public static void main(String[] args) {
        Solution56 s = new Solution56();
        System.out.println(Arrays.deepToString(s.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}})));
    }

}
