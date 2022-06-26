package com.mmw.leetcode.字符串;

public class Solution67_2_二进制求和 {
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int len = Math.max(a.length(), b.length());
        for (int i = 0; i < len ; i++) {
            if (i < a.length()) {
                carry += a.charAt(a.length()-1-i) - '0';
            } else {
                carry += 0;
            }
            if (i < b.length()) {
                carry += b.charAt(b.length()-1-i) - '0';
            } else {
                carry += 0;
            }
            ans.append(carry % 2);
            carry = carry / 2;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }

}
