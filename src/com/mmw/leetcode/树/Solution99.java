package com.mmw.leetcode.树;

import java.util.LinkedList;

public class Solution99 {
    public void recoverTree(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pre = null;
        TreeNode x = null, y = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.poll();
            if (pre!= null && root != null && root.val < pre.val) {
                y = root;
                if (x == null) {
                    x = pre;
                } else {
                    break;
                }
            }
            pre = root;
            root = root.right;
        }
        swap(x, y);
    }

    private void swap(TreeNode x, TreeNode y) {
        int temp = y.val;
        y.val = x.val;
        x.val = temp;
    }
}
