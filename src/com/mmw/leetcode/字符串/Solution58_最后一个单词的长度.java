package com.mmw.leetcode.字符串;

public class Solution58_最后一个单词的长度 {
    public static int lengthOfLastWord(String s) {
        String ans = s.trim();
        int count = 0;
        for (int i = ans.length()-1; i >= 0 ; i--) {
            if (ans.charAt(i) == ' ') {
                break;
            } else {
                count += 1;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }


}
