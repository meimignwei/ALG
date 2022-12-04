package src.com.mmw.leetcode_2022_11.链表;

import java.util.*;
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> res = new ArrayList<Integer>();
        if (head == null) {
            return true;
        }
        ListNode cur = head;
        while (cur != null) {
            res.add(cur.val);
            cur = cur.next;
        }
        int left = 0;
        int right = res.size() - 1;
        while (left < right) {
            if (res.get(left) != res.get(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }

}
