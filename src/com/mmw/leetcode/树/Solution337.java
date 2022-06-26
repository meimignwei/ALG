package com.mmw.leetcode.树;

import java.util.HashMap;
import java.util.Map;

public class Solution337 {
    Map<TreeNode, Integer> no = new HashMap<TreeNode, Integer>();
    Map<TreeNode, Integer> yes = new HashMap<TreeNode, Integer>();
    public int rob(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return Math.max(no.getOrDefault(root,0), yes.getOrDefault(root,0));
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        yes.put(root, root.val + no.getOrDefault(root.left, 0) + no.getOrDefault(root.right, 0));
        no.put(root, Math.max(no.getOrDefault(root.left, 0), yes.getOrDefault(root.left, 0))
                + Math.max(no.getOrDefault(root.right, 0), yes.getOrDefault(root.right, 0)));
    }

}
