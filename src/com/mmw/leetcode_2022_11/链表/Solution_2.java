package src.com.mmw.leetcode_2022_11.链表;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (cur1 != null || cur2 != null) {
            int temp1 = 0;
            int temp2 = 0;
            if (cur1 != null) {
                temp1 = cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                temp2 = cur2.val;
                cur2 = cur2.next;
            }
            cur.next = new ListNode((temp1 + temp2 + carry) % 10);
            carry = (temp1 + temp2 + carry) / 10;
            cur = cur.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return res.next;
    }
}
