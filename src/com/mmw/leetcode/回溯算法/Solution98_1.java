package com.mmw.leetcode.回溯算法;

public class Solution98_1 {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode root, Integer low, Integer upper) {
        if (root == null) return true;
        if (low != null && root.val <= low) return false;
        if (upper != null && root.val >= upper) return false;
        return dfs(root.left, low, root.val) && dfs(root.right, root.val, upper);
    }

}
