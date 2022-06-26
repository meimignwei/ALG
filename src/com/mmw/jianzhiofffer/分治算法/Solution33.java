package com.mmw.jianzhiofffer.分治算法;

public class Solution33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0) return true;
        return judge(postorder, 0, postorder.length - 1);
    }

    private boolean judge(int[] postorder, int l, int r) {
        if (l >= r) return true;
        int p = l;
        while (postorder[p] < postorder[r]) p++;
        int m = p;
        while (postorder[p] > postorder[r]) p++;
        return p == r && judge(postorder, l, m - 1) && judge(postorder, m, r - 1);
    }
}
