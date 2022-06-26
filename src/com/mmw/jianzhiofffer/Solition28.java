package com.mmw.jianzhiofffer;

public class Solition28 {
    public boolean isSymmetric(TreeNode root) {
        return checkout(root, root);
    }
    private boolean checkout(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) return true;
        if (root == null || root1 == null) return false;
        return root.val == root1.val && checkout(root.left, root1.right) && checkout(root.right, root1.left);
    }
}
