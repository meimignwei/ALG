package src.com.mmw.jianzhi;
import java.util.*;
/*
* 1.自己可以多调试调试，尤其是时间超时的时候，要么是递归调用超时，要么是循环条件有问题
* 2.优化
* */
public class Solution54 {
    private List<Integer> list = new ArrayList<Integer>();
    public int kthLargest(TreeNode root, int k) {
        middleSearch(root);
        System.out.println(list);
//        if (k >= list.size()) {
//            k = k % (list.size());
//        }
//        int res = list.get(0);
//        for (int i = list.size()-1; i >= 0; i--) {
//            if (i == list.size() - k) {
//                res = list.get(i);
//            }
//        }
//        return res;
        return list.get(list.size() - k);
    }

    private void middleSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        middleSearch(root.left);
        list.add(root.val);
        middleSearch(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        Solution54 s = new Solution54();
        System.out.println(s.kthLargest(root,1));
    }
}
