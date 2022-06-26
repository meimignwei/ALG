package com.mmw.jianzhiofffer.搜索与回溯算法;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Solution37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root ==null) return "[]";
        Deque<TreeNode> deque = new LinkedList<>();
        StringBuilder res = new StringBuilder("[");
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode tmp = deque.poll();
            if (tmp != null) {
                res.append(tmp.val + ",");
                deque.offer(tmp.left);
                deque.offer(tmp.right);
            } else {
                res.append("null,");
            }
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] tmp = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(tmp[0]));
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int i = 1;
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            if (!Objects.equals(tmp[i], "null")) {
                node.left = new TreeNode(Integer.parseInt(tmp[i]));
                deque.offer(node.left);

            }
            i++;
            if (!Objects.equals(tmp[i], "null")) {
                node.right = new TreeNode(Integer.parseInt(tmp[i]));
                deque.offer(node.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println(deserialize("[]"));
    }

}
