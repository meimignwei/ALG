package com.mmw.jianzhiofffer;

import java.util.HashMap;

public class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode cur = head;
        while (cur != null){
            count += 1;
            cur = cur.next;
        }
//        k = k % count;
        ListNode current = head;
        while (k > 0){
            k -= 1;
            current = current.next;
        }
        ListNode result = head;
        while (current != null){
            current = current.next;
            result = result.next;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(1%1);
    }

}
