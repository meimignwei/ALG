package com.mmw.jianzhiofffer;

import java.util.logging.Handler;

public class Solution52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB){
            if(curA == null){
                curA = headB;
            }else {
                curA = curA.next;
            }
            if (curB == null){
                curB = headA;
            }else {
                curB = curB.next;
            }
        }
        return curA;
    }
    public ListNode getWrongIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB){
            curA = curA.next;
            if (curA == null) curA = headB;
            curB = curB.next;
            if (curB == null) curB = headA;
        }
        return curA;
    }

}
