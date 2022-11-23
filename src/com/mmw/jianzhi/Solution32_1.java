package src.com.mmw.jianzhi;
import java.util.*;
public class Solution32_1 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            TreeNode temp = deque.removeFirst();
            if (temp.left != null) {
                deque.offer(temp.left);
            }
            if (temp.right != null) {
                deque.offer(temp.right);
            }
            list.add(temp.val);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
