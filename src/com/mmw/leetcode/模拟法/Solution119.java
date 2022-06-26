package com.mmw.leetcode.模拟法;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tmp.add(1);
                } else {
                    tmp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(tmp);
        }
        return ans.get(rowIndex);
    }

}
