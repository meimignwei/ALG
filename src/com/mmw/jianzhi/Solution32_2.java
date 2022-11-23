package src.com.mmw.jianzhi;
import java.util.*;
public class Solution32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        List<Integer> temp1 = new ArrayList();
        temp1.add(root.val);
        deque.offer(root);
        res.add(temp1);
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList();
            int length = deque.size();
            for (int i = 0; i < length; i++) {
                TreeNode temp = deque.removeFirst();
                if (temp.left != null) {
                    deque.offer(temp.left);
                    list.add(temp.left.val);
                }
                if (temp.right != null) {
                    deque.offer(temp.right);
                    list.add(temp.right.val);
                }
            }
            if (list.size() != 0) {
                res.add(list);
            }
        }
        return res;
    }

}
