package src.com.mmw.jianzhi;
/*
* 注意这里，重点关注！
* */
public class Solutiuon68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) return null;
        else if (left != null && right == null) return left;
        else if (right != null && left == null) {
            return right;
        } else if(left != null && right != null) {
            return root;
        }else
            return null;
    }
}
