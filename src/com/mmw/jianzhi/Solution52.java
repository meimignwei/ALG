package src.com.mmw.jianzhi;

public class Solution52 {
    //无法实现两个链表不存在相连的情况
    //这里的情况是因为判断为null的时候，导致无法走到：while (curB != curA)
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curB != curA) {
            curA = curA.next;
            if (curA == null) {
                curA = headB;
            }
            curB = curB.next;
            if (curB == null) {
                curB = headA;
            }
        }
        return curA;
    }
    ListNode getIntersectionNodeOptimize(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curB != curA) {
            if (curA == null) {
                curA = headB;
            }else{
                curA = curA.next;
            }
            if (curB == null) {
                curB = headA;
            }else{
                curB = curB.next;
            }
        }
        return curA;
    }

    public static void main(String[] args) {
        System.out.println(null == null);
    }
}
