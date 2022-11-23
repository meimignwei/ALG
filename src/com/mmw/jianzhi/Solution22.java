package src.com.mmw.jianzhi;
/*
* 先让一个第一个node从头先走K步，然后再让第二个节点从头开始一起走，
* 第一个节点到达尾部时候，第二个节点为所求节点
* */
public class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode first = head;
        for (int i = k; i >1 ; i--) {
            first = first.next;
        }
        ListNode sec = head;
        while (first.next != null) {
            first = first.next;
            sec = sec.next;
        }
        return sec;
    }
}
