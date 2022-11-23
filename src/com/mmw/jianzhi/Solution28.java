package src.com.mmw.jianzhi;

public class Solution28 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricJudge(root, root);
    }

    private boolean isSymmetricJudge(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        } else if (root == null || root1 == null) {
            return false;
        }
        return root.val == root1.val
                && isSymmetricJudge(root.left, root1.right)
                && isSymmetricJudge(root.right, root1.left);
    }
}
