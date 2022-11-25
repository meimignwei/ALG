package src.com.mmw.jianzhi;

public class Solution68_1 {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null) return root;
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left,p,q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right,p,q);
        }
        System.out.println(root.val);
        return root;
    }

    public static void main(String[] args) {
        Solution68_1 s = new Solution68_1();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        System.out.println(s.lowestCommonAncestor(root,root.left,root.left.left));
    }
}
