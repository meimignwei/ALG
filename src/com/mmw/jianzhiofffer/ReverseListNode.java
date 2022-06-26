package com.mmw.jianzhiofffer;

public class ReverseListNode {
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode result = head;
        while (result != null){
            ListNode temp = result.next;
            result.next = pre;
            pre = result;
            result = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        System.out.println(reverseList(a));

    }
}
