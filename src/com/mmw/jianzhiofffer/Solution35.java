package com.mmw.jianzhiofffer;

import java.util.HashMap;

public class Solution35 {
    HashMap<Node, Node> hashMap = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        Node cur = head;
        while (cur != null){
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        Node temp = head;
        while (temp != null){
            hashMap.get(temp).next = hashMap.get(temp.next);
            hashMap.get(temp).random = hashMap.get(temp.random);
            temp = temp.next;
        }
        return hashMap.get(head);
    }
}
