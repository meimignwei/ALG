package com.mmw.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0) return res;
        dfs(n, 0, 0, new StringBuilder());
        return res;
    }

    private void dfs(int n, int l, int r, StringBuilder stringBuilder) {
        if (stringBuilder.length() == 2 * n) {
            res.add(stringBuilder.toString());
            return;
        }
        if (l < n) {
            stringBuilder.append("(");
            dfs(n,l+1,r,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (l > r) {
            stringBuilder.append(")");
            dfs(n,l,r+1,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
