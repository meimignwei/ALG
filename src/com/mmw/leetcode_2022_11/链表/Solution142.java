package src.com.mmw.leetcode_2022_11.链表;

import java.util.HashSet;
import java.util.Set;

public class Solution142 {
    Set<ListNode> set = new HashSet<ListNode>();
    public ListNode detectCycle(ListNode head) {
        ListNode cur = head;
        ListNode res = null;
        while (cur != null) {
            if (set.contains(cur)) {
                res = cur;
                break;
            } else {
                set.add(cur);
            }
            cur = cur.next;
        }
        return res;
    }
}
