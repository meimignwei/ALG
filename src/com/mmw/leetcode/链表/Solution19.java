package com.mmw.leetcode.链表;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode cur = head;
        ListNode res = new ListNode(0);
        while (cur != null) {
            count += 1;
            cur = cur.next;
        }
        int tmp = count - n;
        ListNode dummpy = new ListNode(0, head);
        cur = dummpy;
        while (cur.next != null && tmp > 0) {
            cur = cur.next;
            tmp -= 1;
        }
        cur.next = cur.next.next;
        return dummpy.next;
    }
}
