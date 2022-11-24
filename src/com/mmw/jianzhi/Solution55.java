package src.com.mmw.jianzhi;

public class Solution55 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        Solution55 s = new Solution55();
        System.out.println(s.maxDepth(root));
    }
}
