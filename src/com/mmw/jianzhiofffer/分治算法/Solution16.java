package com.mmw.jianzhiofffer.分治算法;

public class Solution16 {
    public static double myPow(double x, int n) {
        if (x == 0.0f) return 0.0d;
        double res = 1.0;
        long a = n;
        if (a < 0) {
            a = -a;
            x = 1 / x;
        }
        while (a > 0){
            if ((a & 1) == 1) res *= x;
            x *= x;
            a = a >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,4));
        System.out.println(2>>1);
    }
}
