package com.mmw.jianzhiofffer;

public class Solution58_1 {
    public static String reverseWords(String s) {
        String[] temp = s.trim().split(" ");
        String result = "";
        for (int i = temp.length-1; i >= 0 ; --i) {
            if (i==0 && temp[i] != ""){
                result += temp[i];
            }else if(temp[i] != ""){
                result += temp[i];
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!  "));
    }
}
