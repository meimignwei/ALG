package src.com.mmw.leetcode_2022_11.链表;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        ListNode res = null;
        //这里||的条件比较关键，不能是&&，否则只要一个为null,就退出了。
        while (cur1 != null || cur2 != null) {
            if (cur1 == cur2) {
                res = cur1;
                break;
            }
            if (cur1 == null) {
                cur1 = headB;
            }else {
                cur1 = cur1.next;
            }

            if (cur2 == null) {
                cur2 = headA;
            } else {
                cur2 = cur2.next;
            }
        }
        return res;
    }
}
