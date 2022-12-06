package src.com.mmw.leetcode_2022_11.树;

public class Solution543 {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return ans-1;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans = Math.max(left + right + 1, ans);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution543 s = new Solution543();
        System.out.println(s.diameterOfBinaryTree(root));
    }

}
