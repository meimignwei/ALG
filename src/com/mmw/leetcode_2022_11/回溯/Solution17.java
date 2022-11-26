package src.com.mmw.leetcode_2022_11.回溯;

import java.util.*;
  /*
  * 标准的回溯算法模版
  * */
public class Solution17 {
    List<String> res = new ArrayList<String>();
    StringBuilder temp = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap<Character, String>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        dfs(0, digits, map);
        return res;
    }

    private void dfs(int i, String digits, Map<Character, String> map) {
        if (i > digits.length()) {
            return;
        }
        if (i == digits.length()) {
            res.add(temp.toString());
            return;
        }
        if (map.containsKey(digits.charAt(i))) {
            String tmp = map.get(digits.charAt(i));
            for (int j = 0; j < tmp.length(); j++) {
                temp.append(tmp.charAt(j));
                dfs(i + 1, digits, map);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution17 s = new Solution17();
        System.out.println(s.letterCombinations("23"));
    }
}
