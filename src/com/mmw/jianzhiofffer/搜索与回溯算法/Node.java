package com.mmw.jianzhiofffer.搜索与回溯算法;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node (int val) {
        this.val = val;
    }
    public Node() {
    }
    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
