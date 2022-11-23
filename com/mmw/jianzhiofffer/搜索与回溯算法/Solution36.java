package com.mmw.jianzhiofffer.搜索与回溯算法;

import src.com.mmw.leetcode.树.Node;

public class Solution36 {
    Node head, pre;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    private void dfs(Node root) {
        if (root == null) return;
        dfs(root.left);
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        root.left = pre;
        pre = root;
        dfs(root.right);
    }
}
