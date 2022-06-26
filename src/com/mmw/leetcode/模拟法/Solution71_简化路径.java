package com.mmw.leetcode.模拟法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Solution71_简化路径 {
    public static String simplifyPath(String path) {
        String[] tmp = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 0; i < tmp.length; i++) {
            if (stack.size() > 0 && Objects.equals(tmp[i], "..")) {
                stack.removeLast();
            } else if (!Objects.equals(tmp[i], ".") && !Objects.equals(tmp[i], "") && !Objects.equals(tmp[i], "..")) {
                stack.addLast(tmp[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        if (stack.size() == 0) {
            return "/";
        }
        for (int i = 0; i < stack.size(); i++) {
            ans.append("/");
            ans.append(stack.get(i));
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }

}
