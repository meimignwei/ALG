package src.com.mmw.leetcode_2022_11.树;

import java.util.*;
public class Solution114 {
    List<TreeNode> res = new ArrayList<TreeNode>();
    public void flatten(TreeNode root) {
        dfs(root);
        for (int i = 1; i < res.size(); i++) {
            TreeNode pre = res.get(i - 1);
            TreeNode cur = res.get(i);
            pre.right = cur;
            pre.left = null;
        }
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        res.add(root);
        dfs(root.left);
        dfs(root.right);
    }


}
