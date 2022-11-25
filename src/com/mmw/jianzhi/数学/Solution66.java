package src.com.mmw.jianzhi.数学;

import java.util.Arrays;

public class Solution66 {

    /*
    * 超出时间限制
    * */
    public int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int temp = 1;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    temp *= a[j];
                }
            }
            res[i] = temp;
        }
        return res;
    }

    /*
    * 优化
    * */

    public int[] constructArr1(int[] a) {
        if (a.length == 0) return new int[0];
        int[] B = new int[a.length];
        B[0] = 1;
        for (int i = 1; i < a.length; i++) {
            B[i] = a[i - 1] * B[i - 1];
        }
        System.out.println(Arrays.toString(B));
        int tmp = 1;
        for (int i = a.length - 1; i >= 1; i--) {
            tmp *= a[i];
            B[i-1] *= tmp;
        }
        return B;
    }

    public static void main(String[] args) {
        Solution66 s = new Solution66();
        System.out.println(Arrays.toString(s.constructArr1(new int[]{1, 2, 3, 4, 5})));
    }
}
