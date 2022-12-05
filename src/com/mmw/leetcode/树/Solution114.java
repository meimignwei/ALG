package src.com.mmw.leetcode.树;

public class Solution114 {
    public void flatten(TreeNode root) {
        dfs(root);
    }

    private void dfs(TreeNode root) {
        if (root == null) return;


        dfs(root.left);
        dfs(root.right);
    }
}
