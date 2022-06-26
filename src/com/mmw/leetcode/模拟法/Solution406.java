package com.mmw.leetcode.模拟法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution406 {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                } else {
                    return o1[1]-o2[1];
                }
            }
        });
//        return people;
        List<int[]> list = new ArrayList<>();
        for (int[] a: people) {
            list.add(a[1],a);
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}})));
    }

}
