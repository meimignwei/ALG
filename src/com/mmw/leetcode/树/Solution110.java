package src.com.mmw.leetcode.树;

import src.com.mmw.jianzhi.TreeNode;

public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(Maxdepth(root.left) - Maxdepth(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int Maxdepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(Maxdepth(root.left), Maxdepth(root.right)) + 1;
    }

}
