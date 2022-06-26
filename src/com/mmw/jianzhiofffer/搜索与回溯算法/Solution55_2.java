package com.mmw.jianzhiofffer.搜索与回溯算法;
/*
* 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
* */
public class Solution55_2 {
    public boolean isBalanced(TreeNode root) {
        if (root ==null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


}
