package com.mmw.leetcode.回溯算法;

import java.util.*;

public class Solution90_子集II {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(0, nums);
        res.addAll(ans);
        return res;
    }
    private void dfs(int i, int[] nums) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (i >= nums.length) {
            return;
        }
        temp.add(nums[i]);
        dfs(i+1,nums);
        temp.remove(temp.size() - 1);
        dfs(i+1,nums);
    }

}
