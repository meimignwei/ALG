package com.mmw.jianzhiofffer.搜索与回溯算法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution38 {
    char[] res;
    List<String> list = new ArrayList<>();
    public String[] permutation(String s) {
        res = s.toCharArray();
        dfs(0);
        return list.toArray(new String[res.length]);
    }

    private void dfs(int i) {
        if (i == res.length - 1) {
            list.add(String.valueOf(res));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int j = i; j < res.length; j++) {
            if (set.contains(res[j])) continue;
            set.add(res[j]);
            swap(i, j);
            dfs(i + 1);
            swap(i, j);
        }
    }

    private void swap(int i, int j) {
        char tmp = res[i];
        res[i] = res[j];
        res[j] = tmp;
    }

}
