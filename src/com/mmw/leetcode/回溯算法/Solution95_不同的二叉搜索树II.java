package com.mmw.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution95_不同的二叉搜索树II {
    public List<TreeNode> generateTrees(int n) {
        return dfs(1,n);
    }

    private List<TreeNode> dfs(int start, int end) {
        List<TreeNode> ans = new ArrayList<>();
        if (start > end) {
            ans.add(null);
            return ans;
        }
        for (int i = start; i <= end ; i++) {
            List<TreeNode> left = dfs(start, i - 1);
            List<TreeNode> right = dfs(i + 1, end);
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode cur = new TreeNode(i);
                    cur.left = left.get(j);
                    cur.right = right.get(k);
                    ans.add(cur);
                }
            }
        }
        return ans;
    }

}
