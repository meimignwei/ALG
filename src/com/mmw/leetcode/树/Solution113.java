package src.com.mmw.leetcode.树;

import java.util.ArrayList;
import java.util.List;

public class Solution113 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return res;
        dfs(root, 0, targetSum);
        return res;
    }

    private void dfs(TreeNode root, int i, int targetSum) {
        if (i == targetSum - root.val && root.left ==  null && root.right == null) {
            temp.add(root.val);
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        if (root == null) return;
        temp.add(root.val);
        if(root.left != null) dfs(root.left,i+root.val,targetSum);
        if(root.right != null) dfs(root.right,i+root.val,targetSum);
        temp.remove(temp.size() - 1);
    }
}
