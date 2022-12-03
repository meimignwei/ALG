package src.com.mmw.leetcode_2022_11.树;

import java.util.*;


/*
* 重点关注
* */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeObject(map,preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeObject(Map<Integer, Integer> map, int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
        if (l1 > r1 || l1 > preorder.length-1 || r1 > preorder.length-1) return null;
        int tmp = preorder[l1];
        TreeNode root = new TreeNode(tmp);
        //这里的从map获取的只是坐标不是长度
        int index = map.get(tmp);
        int len = index - l2;
        root.left = buildTreeObject(map, preorder, l1 + 1, l1 + len, inorder, l2, l2 + len - 1);
        root.right = buildTreeObject(map, preorder, l1 + len + 1, r1, inorder, l2 + len + 1, r2);
        return root;
    }

}
