package src.com.mmw.leetcode_2022_11.链表;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        //时刻注意这些细节
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count += 1;
        }
        System.out.println(count);
        int temp = count - n;
        ListNode res = new ListNode(0);
        ListNode cur1 = head;
        res.next = head;
        ListNode pre = res;
        System.out.println(temp);
        //时刻注意这些细节temp --
        while (temp > 0) {
            cur1 = cur1.next;
            pre = pre.next;
            temp--;
        }
        if (cur1 != null) {
            pre.next = cur1.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Solution19 s = new Solution19();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        System.out.println(s.removeNthFromEnd(root,2));
    }

}
