package src.com.mmw.jianzhiofffer.分治算法;


import src.com.mmw.jianzhi.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) return null ;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeNode(map,preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    private TreeNode buildTreeNode(Map<Integer, Integer> map, int[] preorder, int[] inorder, int i, int length1, int j, int length2) {
        if (i > length1) return null;
        int tree_root = preorder[i];
        int index_root = map.get(tree_root);
        int length_root = index_root - j;
        TreeNode root = new TreeNode(tree_root);
        root.left = buildTreeNode(map, preorder, inorder, i + 1, i + length_root, j, j + length_root-1);
        root.right = buildTreeNode(map, preorder, inorder, i + length_root + 1, length1, j + length_root + 1, length2);
        return root;
    }
}
