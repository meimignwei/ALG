package com.mmw.leetcode.链表;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur_1 = headA;
        ListNode cur_2 = headB;
        while (cur_1 != cur_2) {
            if (cur_1 == null) cur_1 = headB;
            else cur_1 = cur_1.next;
            if (cur_2 == null) cur_2 = headA;
            else cur_2 = cur_2.next;
        }

        return cur_1;
    }

}
