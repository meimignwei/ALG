package src.com.mmw.leetcode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        if (l1==null) return l2;
        if (l2 == null) return l1;
        ListNode cur = res;
        int l1_val = 0;
        int l2_val = 0;
        int act = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null){
                l1_val = l1.val;
                l1 = l1.next;
            } else l1_val = 0;
            if (l2!=null){
                l2_val = l2.val;
                l2 = l2.next;
            } else l2_val = 0;
            int tmp = l1_val + l2_val + act;
            cur.next = new ListNode(tmp % 10);
            act = tmp / 10;
            cur = cur.next;
        }
        if (act == 1) {
            cur.next = new ListNode(1);
        }
        return res.next;
    }

    public static void main(String[] args) {
        System.out.println(10%10);
        System.out.println();
    }

}
