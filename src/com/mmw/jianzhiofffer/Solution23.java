package com.mmw.jianzhiofffer;

import java.util.HashSet;
import java.util.Set;

public class Solution23 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return head;
            else set.add(head);
            head = head.next;
        }
        return null;
    }
}
