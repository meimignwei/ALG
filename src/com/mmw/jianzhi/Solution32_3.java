package src.com.mmw.jianzhi;
import java.util.*;
public class Solution32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.offer(root);
        int count = 1;
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList();
            int length = deque.size();
            count += 1;
            for (int i = 0; i < length; i++) {
                TreeNode temp = deque.removeFirst();
                list.add(temp.val);
                if (temp.left != null) {
                    deque.offer(temp.left);
                }
                if (temp.right != null) {
                    deque.offer(temp.right);
                }
            }
            if (count % 2 == 1) {
                res.add(reverse(list));
            } else {
                res.add(list);
            }
        }
        return res;
    }

    private List<Integer> reverse(List<Integer> list) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = list.size()-1; i > 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }
}
