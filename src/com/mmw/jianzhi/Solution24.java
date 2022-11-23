package src.com.mmw.jianzhi;
import java.util.*;
public class Solution24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //注意要提前设置临时变量
            ListNode temp = cur.next;
            cur.next = pre;
            //注意顺序
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
