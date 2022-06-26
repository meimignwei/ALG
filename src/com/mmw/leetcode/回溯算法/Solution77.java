package com.mmw.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k,temp);
        return res;
    }

    private void dfs(int i, int n, int k, List<Integer> temp) {
//        if (n - i + 1 < k) {
//            return;
//        }
        if (i > n) {
            return;
        }
        if (i <= n && temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(i);
        dfs(i + 1,n,k,temp);
        temp.remove(temp.size() - 1);

        dfs(i+1,n,k,temp);
    }
}
