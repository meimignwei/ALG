package com.mmw.jianzhiofffer;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Solution26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean flag = false;
        if(A!=null && B!=null){
            if (A.val == B.val) {
                flag = judge(A, B);
            }
            if (!flag){
                flag = isSubStructure(A.left, B);
            }
            if(!flag){
                flag = isSubStructure(A.right, B);
            }
        }
        return flag;
    }

    private boolean judge(TreeNode a, TreeNode b) {
        if(b==null) return true;
        if (a==null) return false;
        if (a==null || b == null) return false;
        if (a.val != b.val) return false;
        return judge(a.left, b.left) && judge(a.right, b.right);
    }
}
