package com.mmw.leetcode.链表;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        ListNode pre = head;
        res.next = pre;
        ListNode cur = head;
        while (cur != null) {
            while (cur != null && cur.val == pre.val) {
                cur = cur.next;
            }
            pre.next = cur;
            pre = cur;
        }
        return res;
    }

}
