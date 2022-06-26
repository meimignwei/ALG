package com.mmw.leetcode.回溯算法;

import java.util.*;

public class Solution47_全排列 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }
        dfs(0, nums);
        res.addAll(ans);
        return res;
    }

    private void dfs(int i, int[] nums) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
        }
        for (int j = i; j < nums.length; j++) {
            Collections.swap(temp,i,j);
            dfs(i+1,nums);
            Collections.swap(temp,i,j);
        }
    }

}
