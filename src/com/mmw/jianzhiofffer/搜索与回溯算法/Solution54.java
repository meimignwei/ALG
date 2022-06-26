package com.mmw.jianzhiofffer.搜索与回溯算法;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
* */
public class Solution54 {
    List<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        dfs(root);
        return list.get(list.size() - k);

    }
    private void dfs(TreeNode root) {
        if (root == null) return;
        if (root.left != null) dfs(root.left);
        list.add(root.val);
        if (root.right != null) dfs(root.right);
    }
}
