package com.mmw.leetcode.回溯算法;

import java.util.*;

public class Solution40_组合总和II {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }
        //关键步骤，进行排序
        Arrays.sort(candidates);
        dfs(0,0, target,candidates);
        res.addAll(ans);
        return res;
    }

    private void dfs(int i, int j, int target, int[] candidates) {
        if (j == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (i > candidates.length) {
            return;
        }
        temp.add(candidates[i]);
        dfs(i+1,j+candidates[i],target,candidates);
        temp.remove(temp.size()-1);
        dfs(i+1,j,target,candidates);
    }
}
