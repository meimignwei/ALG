package com.mmw.jianzhiofffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listResult = new ArrayList<List<Integer>>();
        if (root == null) {
            return listResult;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            List<Integer> tempList = new ArrayList<>();
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = deque.poll();
                tempList.add(temp.val);
                if (temp.left !=null){
                    deque.offer(temp.left);
                }
                if (temp.right !=null){
                    deque.offer(temp.right);
                }
            }
            listResult.add(tempList);
        }
        return listResult;
    }
}
