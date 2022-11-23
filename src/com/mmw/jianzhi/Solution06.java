package src.com.mmw.jianzhi;


import java.util.*;

public class Solution06 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] res = new int[list.size()];
        int j = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            res[j] = list.get(i);
            j++;
        }
        return res;
    }
}
