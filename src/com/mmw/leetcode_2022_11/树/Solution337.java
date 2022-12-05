package src.com.mmw.leetcode_2022_11.树;

import java.util.*;
public class Solution337 {
    Map<TreeNode, Integer> yes = new HashMap<TreeNode, Integer>();
    Map<TreeNode, Integer> no = new HashMap<TreeNode, Integer>();
    public int rob(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return Math.max(yes.getOrDefault(root, 0), no.getOrDefault(root, 0));
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        yes.put(root, root.val + no.getOrDefault(root.left, 0) + no.getOrDefault(root.right,0));
        no.put(root, Math.max(yes.getOrDefault(root.left, 0), no.getOrDefault(root.left, 0))
                + Math.max(yes.getOrDefault(root.right, 0), no.getOrDefault(root.right, 0)));
    }

}
