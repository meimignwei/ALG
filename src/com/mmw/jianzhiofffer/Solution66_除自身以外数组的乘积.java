package com.mmw.jianzhiofffer;
/*
* 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
* 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
* */

public class Solution66_除自身以外数组的乘积 {
    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[0];
        int[] rs = new int[a.length];
        int tmp = 1;
        rs[0] = 1;
        for (int i = 1; i < a.length; i++) {
            rs[i] = a[i - 1] * rs[i - 1];
        }
        for (int i = a.length-2; i >=0 ; i--) {
            tmp *= a[i + 1];
            rs[i] = tmp*rs[i];
        }
        return rs;
    }
}
