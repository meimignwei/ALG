package com.mmw.jianzhiofffer;

public class Solution58_2 {
    public static  String reverseLeftWords(String s, int n) {
        String res = "";
        return res.concat(s.substring(n, s.length())).concat(s.substring(0,n));
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("helloworld",3));
    }

}
