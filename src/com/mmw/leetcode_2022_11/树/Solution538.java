package src.com.mmw.leetcode_2022_11.树;

public class Solution538 {
    int tmp = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        convertBST(root.right);
        tmp += root.val;
        root.val = tmp;
        convertBST(root.left);
        return root;
    }

}
