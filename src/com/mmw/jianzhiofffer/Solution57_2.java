package com.mmw.jianzhiofffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int l = 1;
        int r = 2;
        int s = 3;
        while (l < r) {
            if (s == target) {
                int[] tmp = new int[r - l + 1];
                for (int k = 0; k <= r-l; k++) {
                    tmp[k] = k + l;
                }
                res.add(tmp);
            }
            /*
             * 如果这里没有等于，那么会一直在s==target这里运行，直至内存溢出
             * */
            if (s >= target) {
                s -= l;
                l += 1;
            } else {
                r += 1;
                s += r;
            }
        }
        return res.toArray(new int[0][]);
    }
}
