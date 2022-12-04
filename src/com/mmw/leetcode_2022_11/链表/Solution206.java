package src.com.mmw.leetcode_2022_11.链表;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
