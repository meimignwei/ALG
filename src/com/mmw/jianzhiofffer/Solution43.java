package com.mmw.jianzhiofffer;

public class Solution43 {
    /*
    * 这种解法超出内存限制
    * */
    public int countDigitOne(int n) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 1; i <= n ; i++) {
            tmp.append(i);
        }
        System.out.println(tmp);
        int count = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
