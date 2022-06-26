package com.mmw.jianzhiofffer;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution32_1 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            TreeNode temp = deque.poll();
            list.add(temp.val);
            if (temp.left != null){
                deque.offer(temp.left);
            }
            if (temp.right != null){
                deque.offer(temp.right);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
}
