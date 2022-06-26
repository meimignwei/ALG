package com.mmw.leetcode.分治算法;


import java.util.List;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) return lists[l];
        int mid = (l + r) / 2;
        ListNode l1 = merge(lists, l, mid);
        ListNode l2 = merge(lists, mid + 1, r);
        return mergeTwo(l1, l2);
    }

    private ListNode mergeTwo(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode node = null;
        if (l1.val < l2.val) {
            node = new ListNode(l1.val);
            node.next = mergeTwo(l1.next, l2);
        } else if (l1.val > l2.val) {
            node = new ListNode(l2.val);
            node.next = mergeTwo(l1, l2.next);
        }
        return node;
    }

}
