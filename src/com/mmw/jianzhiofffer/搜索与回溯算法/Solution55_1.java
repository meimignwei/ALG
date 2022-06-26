package com.mmw.jianzhiofffer.搜索与回溯算法;

public class Solution55_1 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
