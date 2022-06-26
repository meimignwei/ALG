package com.mmw.leetcode.树;

public class Solution112 {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        dfs(root, 0, targetSum);
        return flag;
    }

    private void dfs(TreeNode root, int i, int targetSum) {
        if (i == targetSum - root.val && root.left == null && root.right == null) {
            flag = true;
            return;
        }
        if (root == null) {
            return;
        }
        if (root.left != null) {
            dfs(root.left,i + root.val,targetSum);
        }
        if (root.right != null) {
            dfs(root.right, i + root.val,targetSum);
        }
    }
}
