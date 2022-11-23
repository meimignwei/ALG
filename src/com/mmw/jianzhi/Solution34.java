package src.com.mmw.jianzhi;

import java.util.*;
public class Solution34 {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    private List<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        dfs(root, target,0);
        return res;
    }

    private void dfs(TreeNode root, int target, int i) {
        if (root == null) return;
        temp.add(root.val);
        if (target == i+root.val && root.left == null && root.right == null) {
            res.add(new ArrayList<Integer>(temp));
        }
        dfs(root.left,  target,i + root.val);
        dfs(root.right,  target,i + root.val);
        temp.remove(temp.size() - 1);
    }

}
