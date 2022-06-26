package com.mmw.leetcode.树;

public class Solution543 {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res-1;
    }

    private int dfs(TreeNode root) {
        if (root == null ) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        res = Math.max(left + right + 1, res);
        return Math.max(left, right) + 1;
    }

}
