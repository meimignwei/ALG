package src.com.mmw.jianzhi;

import java.util.Arrays;
import java.util.Objects;
/*
* leetcode可以运行通过，但是本地不行
* */
public class Solution58 {
    public String reverseWords(String s) {
        String[] temp = s.trim().split(" ");
        System.out.println(Arrays.toString(temp));
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            if (i == 0 && temp[i] != "") {
                res += temp[i];
            } else if (temp[i] != ""){
                res += temp[i];
                res += " ";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution58 s = new Solution58();
        System.out.println(s.reverseWords("  hello       world!  "));
    }


}
