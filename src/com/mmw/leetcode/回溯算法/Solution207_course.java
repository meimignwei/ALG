package com.mmw.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.List;
/*
课程表
* */
public class Solution207_course {
    boolean flag = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visit = new int[numCourses];
        List<List<Integer>> dag = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            dag.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            dag.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (flag == true && visit[i] == 0) {
                dfs(visit, dag, i);
            }
        }
        return flag;
    }

    private void dfs(int[] visit, List<List<Integer>> dag, int i) {
        visit[i] = 1;
        for (int a : dag.get(i)) {
            if (flag) {
                dfs(visit,dag,i);
                if (!flag) return;
            } else if (visit[a] == 1) {
                flag = false;
                return;
            }
        }
        visit[i] = 2;
    }

}
