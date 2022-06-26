package com.mmw.leetcode.list;

import java.util.Arrays;

public class Solution66 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int count = 0;
        for(int i=len-1;i >= 0; i--){
            if (i == len - 1) {
                count = (digits[i] + 1) / 10;
                digits[i] = (digits[i] + 1) % 10;
            }else{
                int temp = digits[i] + count;
                digits[i] = temp%10;
                count = temp /10;
            }
            if(digits[i] != 0){
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
    }

}
