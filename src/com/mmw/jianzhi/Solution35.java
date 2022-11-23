package src.com.mmw.jianzhi;

import java.util.*;
class Node1 {
    int val;
    Node1 next;
    Node1 random;

    public Node1(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Solution35 {
    public Node1 copyRandomList(Node1 head) {
        Map<Node1, Node1> map = new HashMap<>();
        if (head == null) return null;
        Node1 cur = head;
        while (cur != null) {
            map.put(cur, new Node1(cur.val));
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }
        return map.get(head);
    }

}
