package com.mmw.leetcode.链表;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        List<Integer> tmp = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            tmp.add(cur.val);
            cur = cur.next;
        }
        int left = 0;
        int right = tmp.size() - 1;
        while (left < right) {
            if (tmp.get(left) != tmp.get(right)) return false;
            left += 1;
            right -= 1;
        }
        return true;
    }

}
