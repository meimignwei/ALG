package src.com.mmw.leetcode.树;

import sun.font.FontRunIterator;

import java.util.*;

public class Solution107 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        if (root == null) {
            return res;
        }
        deque.offer(root);
        while (!deque.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                root = deque.poll();
                if (root.left != null) {
                    deque.offer(root.left);
                }
                if (root.right != null) {
                    deque.offer(root.right);
                }
                tmp.add(root.val);
                }
            res.add(tmp);
        }
        Collections.reverse(res);
        return res;
    }
}
