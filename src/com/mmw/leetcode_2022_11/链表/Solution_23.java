package src.com.mmw.leetcode_2022_11.链表;

public class Solution_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        //注意边界条件
        if (lists.length == 0) {
            return null;
        }
        return mergeLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeLists(ListNode[] lists, int l, int r) {
        if (l > r) return null;
        if (l == r) {
            return lists[l];
        }
        int mid = (l + r) / 2;
        ListNode left = mergeLists(lists, l, mid);
        ListNode right = mergeLists(lists, mid + 1, r);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        if(left == null) return right;
        if (right == null) return left;
        ListNode res;
        if (left.val < right.val) {
            res = new ListNode(left.val);
            res.next = merge(left.next, right);
        } else {
            res = new ListNode(right.val);
            res.next = merge(left, right.next);
        }
        return res;
    }

}
