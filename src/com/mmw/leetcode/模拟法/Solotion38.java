package src.com.mmw.leetcode.模拟法;

public class Solotion38 {
    public String countAndSay(int n) {
        String ans = "1";
        for (int i = 2; i <= n ; i++) {
            StringBuilder tmp = new StringBuilder();
            int start = 0;
            int pos = 0;
            while (pos < ans.length()) {
                while (pos < ans.length() && ans.charAt(pos) == ans.charAt(start)) {
                    pos++;
                }
                tmp.append(pos - start).append(ans.charAt(start));
                start = pos;
            }
            ans = tmp.toString();
        }
        return ans;
    }
}
