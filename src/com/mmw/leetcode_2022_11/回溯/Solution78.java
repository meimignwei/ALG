package src.com.mmw.leetcode_2022_11.回溯;

import java.util.*;
public class Solution78 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return res;
    }

    private void dfs(int i, int[] nums) {
        if (i > nums.length) {
            return;
        }
        if (i == nums.length) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        dfs(i+1,nums);
        temp.add(nums[i]);
        dfs(i+1,nums);
        temp.remove(temp.size() - 1);
    }

    public static void main(String[] args) {
        Solution78 s = new Solution78();
        System.out.println(s.subsets(new int[]{1,2,3}));
    }

}
