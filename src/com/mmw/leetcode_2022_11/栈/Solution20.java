package src.com.mmw.leetcode_2022_11.栈;

import java.util.*;
public class Solution20 {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                //这步很关键比如测试用例："]"
                else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(s.isValid("(]"));
    }
}
