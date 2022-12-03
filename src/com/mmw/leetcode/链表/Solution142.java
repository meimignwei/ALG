package src.com.mmw.leetcode.链表;
import java.util.HashSet;
import java.util.Set;

public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head == null) return null;
        ListNode cur = head;
        while (cur != null) {
            if (set.contains(cur)) return cur;
            set.add(cur);
            cur = cur.next;
        }
        return null;
    }

}
