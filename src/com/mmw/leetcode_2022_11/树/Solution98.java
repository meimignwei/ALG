package src.com.mmw.leetcode_2022_11.树;

public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.left.val >= root.val) return false;
        }
        if (root.right != null) {
            if (root.right.val <= root.val) return false;
        }
        return isValidBST(root.left) && isValidBST(root.right) &&
                isValidBSTJudgeLeft(root.left,root.val) &&
                isValidBSTJudgeRigth(root.right,root.val);
    }

    private boolean isValidBSTJudgeRigth(TreeNode right, int val) {
        if (right == null) return true;
        if (right.val <= val) return false;
        return isValidBSTJudgeRigth(right.left, val) && isValidBSTJudgeRigth(right.right, val);

    }

    private boolean isValidBSTJudgeLeft(TreeNode left, int val) {
        if (left == null) return true;
        if (left.val >= val) return false;
        return isValidBSTJudgeLeft(left.left, val) && isValidBSTJudgeLeft(left.right, val);
    }


}
