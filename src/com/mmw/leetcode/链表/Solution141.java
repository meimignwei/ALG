package src.com.mmw.leetcode.链表;

import java.util.HashSet;
import java.util.Set;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head == null) return false;
        ListNode cur = head;
        while (cur != null) {
            if (set.contains(cur)) return true;
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
