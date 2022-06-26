package com.mmw.leetcode.模拟法;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public static String convert(String s, int numRows) {
        //一定要注意边界条件
        if (numRows == 1) return s;
        int flag = -1;
        int j = 0;
        List<StringBuilder> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            if (j == 0 || j == numRows-1) {
                flag = -flag;
            }
            res.get(j).append(s.charAt(i));
            j += flag;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            ans.append(res.get(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }

}
