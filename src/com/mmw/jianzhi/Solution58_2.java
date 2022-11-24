package src.com.mmw.jianzhi;

public class Solution58_2 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);



    }
}
