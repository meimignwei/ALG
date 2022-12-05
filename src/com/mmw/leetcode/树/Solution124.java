package src.com.mmw.leetcode.树;

public class Solution124 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gainMaxSum(root);
        return res;
    }

    private int gainMaxSum(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(gainMaxSum(root.left), 0);
        int right = Math.max(gainMaxSum(root.right), 0);
        res = Math.max(res, root.val + left + right);
        return root.val + Math.max(left, right);

    }

}
