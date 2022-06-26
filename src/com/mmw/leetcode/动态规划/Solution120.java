package com.mmw.leetcode.动态规划;

import java.util.Arrays;
import java.util.List;

public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] temp = new int[1];
        temp[0] = triangle.get(0).get(0);
        for (int i = 1; i < row; i++) {
            int[] temp1 = new int[triangle.get(i).size()];
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    temp1[0] = temp[0] + triangle.get(i).get(0);
                } else if (j < triangle.get(i).size()) {
                    temp1[j] = Math.min(temp[j - 1] + triangle.get(i).get(j),
                            temp[j] + triangle.get(i).get(j));
                } else {
                    temp1[j] = temp[j - 1] + triangle.get(i).get(j);
                }
            }
            temp = temp1;
        }
        System.out.println(Arrays.toString(temp));
        int count = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (count > temp[i]) {
                count = temp[i];
            }

        }
        return count;
    }

}
