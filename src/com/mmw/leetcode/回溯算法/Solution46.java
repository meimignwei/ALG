package com.mmw.leetcode.回溯算法;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tmp.add(nums[i]);
        }
        dfs(0, res, tmp, nums);
        return res;
    }

    private void dfs(int i, List<List<Integer>> res, List<Integer> tmp, int[] nums) {
        if (i == nums.length) res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length ; j++) {
            Collections.swap(tmp, i, j);
            dfs(i+1,res,tmp,nums);
            Collections.swap(tmp, i, j);
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
