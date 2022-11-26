package src.com.mmw.leetcode_2022_11.回溯;

/*
* 典型的回溯算法
* */
import java.util.*;
public class Solution22 {
    List<String> res = new ArrayList<String>();
    StringBuilder temp = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }
        dfs(0, 0, n);
        return res;
    }

    private void dfs(int l, int r, int n) {
        if (r > n) {
            return;
        }
        if (r == n) {
            res.add(temp.toString());
        }
        if (l < n) {
            temp.append("(");
            dfs(l + 1, r, n);
            temp.deleteCharAt(temp.length() - 1);
        }
        if (l > r) {
            temp.append(")");
            dfs(l,r+1,n);
            temp.deleteCharAt(temp.length() - 1);
        }

    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(s.generateParenthesis(0));
    }

}
