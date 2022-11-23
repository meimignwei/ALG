package src.com.mmw.leetcode.树;

import java.util.Deque;
import java.util.LinkedList;

public class Solution117 {
    public Node connect(Node root) {
        Deque<Node> deque = new LinkedList<>();
        if(root == null) return root;
        deque.offer(root);
        Node pre = null;
        while (!deque.isEmpty()) {
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                Node tmp = deque.poll();
                if (tmp.left != null) {
                    deque.offer(tmp.left);
                }
                if (tmp.right != null) {
                    deque.offer(tmp.right);
                }
                if (i == 0) {
                    pre = tmp;
                } else {
                    pre.next = tmp;
                    pre = tmp;
                }

            }
        }
        return root;
    }
}
