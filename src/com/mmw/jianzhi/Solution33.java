package src.com.mmw.jianzhi;

public class Solution33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0) {
            return false;
        }
        return judgePostorder(postorder, 0, postorder.length - 1);
    }

    private boolean judgePostorder(int[] postorder, int l, int r) {
        if (l >= r) {
            return true;
        }
        int p = l;
        while (postorder[p] < postorder[r]) {
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[r]) {
            p++;
        }
        return r == p
                && judgePostorder(postorder, l, m-1)
                && judgePostorder(postorder,m, r-1);
    }

    public static void main(String[] args) {

    }

}
