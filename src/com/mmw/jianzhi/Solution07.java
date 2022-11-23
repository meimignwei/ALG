package src.com.mmw.jianzhi;

public class Solution07 {
   public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return buildTreeNode(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode buildTreeNode(int[] preorder, int left1, int rigth1, int[] inorder, int left2, int right2) {
       if (left1 > rigth1) return null;
        TreeNode root = new TreeNode(preorder[left1]);
        int index = findIndex(inorder, preorder[left1]);
        root.left = buildTreeNode(preorder, left1+1, index + left1, inorder, left2, left2 + index-1);
        root.right = buildTreeNode(preorder, index + left1 + 1, rigth1, inorder, left2 + index, right2);
        return root;
    }
    private int findIndex(int[]inorder,int target) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
