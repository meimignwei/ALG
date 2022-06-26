package com.mmw.leetcode.模拟法;

public class Solution38 {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i <= n ; i++) {
            String tmp = count(res);
            res = tmp;
        }
        return res;
    }

    private static String count(String res) {
        StringBuilder temp = new StringBuilder();
        int i = 1;
        while (i < res.length()){
            int count = 1;
             while (i < res.length() && res.charAt(i) == res.charAt(i - 1)) {
                count += 1;
                 i += 1;
            }
            temp.append(String.valueOf(count));
            temp.append(res.charAt(i - 1));
            i += 1;
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        System.out.println(count("1211"));
    }
}
