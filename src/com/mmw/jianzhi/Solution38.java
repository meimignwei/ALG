package src.com.mmw.jianzhi;

public class Solution38 {
    String[] res;
    String temp = "";
    public String[] permutation(String s) {
        if (s.length() == 0) {
            return res;
        }
        dfs(s);
        return res;
    }

    private void dfs(String s) {

    }

}
