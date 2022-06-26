package com.mmw.leetcode.回溯算法;

public class Solution98 {
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left != null){
            if (root.left.val >= root.val) flag =  false;
        }
        if (root.right != null) {
            if (root.right.val <= root.val) {
                flag = false;
            }
        }
        return flag && isValidBST(root.left) && isValidBST(root.right);
    }

}
