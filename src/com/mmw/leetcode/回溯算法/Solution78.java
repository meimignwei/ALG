package com.mmw.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.List;

/*
* 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
* */

public class Solution78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs(0, nums, res, tmp);
        return res;
    }

    private static void dfs(int i, int[] nums, List<List<Integer>> res, List<Integer> tmp) {
        if (i == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[i]);
        dfs(i+1,nums,res,tmp);
        tmp.remove(tmp.size() - 1);
        dfs(i+1,nums,res,tmp);
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
