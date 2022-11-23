package src.com.mmw.jianzhi;
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};


public class Solution36 {
    Node pre;
    Node head;
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        pre.left = head;
        head.right = pre;
        dfs(root);
        return head;
    }
    private void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        root.left = pre;
        pre = root;
        dfs(root.right);
    }
}
