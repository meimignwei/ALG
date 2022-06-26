package com.mmw.jianzhiofffer.搜索与回溯算法;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution32_1 {
    public int[] levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        if (root ==null) return new int[0];
        deque.add(root);
        List<Integer> res = new ArrayList<>();
        while (!deque.isEmpty()) {
            TreeNode tmp = deque.poll();
            res.add(tmp.val);
            if (tmp.left != null) deque.offer(tmp.left);
            if (tmp.right != null) deque.offer(tmp.right);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

}
