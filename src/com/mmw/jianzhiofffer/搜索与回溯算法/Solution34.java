package com.mmw.jianzhiofffer.搜索与回溯算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
* 经典回溯算法
* */

public class Solution34 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> tmp = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root== null) return res;
        dfs(root, target);
        return res;
    }
    private void dfs(TreeNode root, int target) {
        if (root == null) return;
        //记录每一个元素并且传入
        tmp.add(root.val);
        if (target == root.val && root.left == null && root.right == null) {
            //此处不可省略：new LinkedList<>(tmp)
            res.add(new LinkedList<>(tmp));
        }
        dfs(root.left, target - root.val);
        dfs(root.right, target - root.val);
        //清空路径
        tmp.removeLast();
    }

}
