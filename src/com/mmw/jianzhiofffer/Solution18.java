package com.mmw.jianzhiofffer;

public class Solution18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = result;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            if (cur.val == val) {
                pre.next = temp;
            }
            cur = cur.next;
            pre = pre.next;
        }
        return result.next;
    }
}
