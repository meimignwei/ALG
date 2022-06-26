package com.mmw.jianzhiofffer;

import java.util.LinkedList;

public class SolutionListNodeReverse {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        ListNode temp = head;
        while (temp != null) {
            result.push(temp.val);
            temp = temp.next;
        }
        int[] result_1 = new int[result.size()];
        for (int i = 0; i < result_1.length; i++) {
            result_1[i] = result.pop();
        }
        return result_1;
    }

}
