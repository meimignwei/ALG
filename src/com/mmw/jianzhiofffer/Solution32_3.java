package com.mmw.jianzhiofffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listResult = new ArrayList<List<Integer>>();
        if (root == null) {
            return listResult;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        int account = 0;
        while (!deque.isEmpty()){
            List<Integer> tempList = new ArrayList<>();
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = deque.poll();
                tempList.add(temp.val);
                if (temp.left != null) {
                    deque.offer(temp.left);
                }
                if (temp.right != null) {
                    deque.offer(temp.right);
                }
            }
            if(account % 2 ==1 ){
                listResult.add(reverse(tempList));
            }else{
                listResult.add(tempList);
            }
            account += 1;
        }
        return listResult;
    }

    private List<Integer> reverse(List<Integer> tempList) {
        List<Integer> result = new ArrayList<>();
        for (int i = tempList.size()-1; i >=0; --i) {
            result.add(tempList.get(i));
        }
        return result;
    }
}
