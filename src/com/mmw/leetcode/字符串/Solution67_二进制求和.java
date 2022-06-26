package com.mmw.leetcode.字符串;
//*
// 如果 aaa 的位数是 nnn，bbb 的位数为 mmm，这个算法的渐进时间复杂度为 O(n+m)O(n + m)O(n+m)。但是这里非常简单的实现基于 Python 和 Java 本身的高精度功能，在其他的语言中可能并不适用，并且在 Java 中：
//    如果字符串超过 333333 位，不能转化为 Integer
//    如果字符串超过 656565 位，不能转化为 Long
//    如果字符串超过 500000001500000001500000001 位，不能转化为 BigInteger
//因此，为了适用于长度较大的字符串计算，我们应该使用更加健壮的算法。
// */
public class Solution67_二进制求和 {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

}
