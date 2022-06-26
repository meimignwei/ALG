package com.mmw.jianzhiofffer;

public class Solution5 {
    public static String replaceSpace(String s) {
        int account = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                account += 1;
            }
        }
        char[] str = new char[s.length() + 2*account];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                str[size++] = '%';
                str[size++] = '2';
                str[size++] = '0';
            }else{
                str[size++] = s.charAt(i);
            }

        }
        return String.valueOf(str).trim();
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
