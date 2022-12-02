package src.com.mmw.leetcode_2022_11.树;

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricJudge(root, root);

    }

    private boolean isSymmetricJudge(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        else if (root1 == null || root2 == null) return false;
        return root1.val == root2.val && isSymmetricJudge(root1.left, root2.right)
                && isSymmetricJudge(root1.right, root2.left);
    }

}
