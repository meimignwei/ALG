package src.com.mmw.leetcode_2022_11.图;

import java.util.*;

//重点关注

/*
* 你这个学期必须选修 numCourses 门课程，记为0到numCourses - 1 。
在选修某些课程之前需要一些先修课程。 先修课程按数组prerequisites 给出，其中prerequisites[i] = [ai, bi] ，表示如果要学习课程ai 则 必须 先学习课程  bi 。
例如，先修课程对[0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
* */
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < numCourses; i++) {
            temp.add(new ArrayList<Integer>());
        }
        int[] in = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            temp.get(prerequisites[i][1]).add(prerequisites[i][0]);
            in[prerequisites[i][0]] += 1;
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            count++;
            for (Integer after : temp.get(pre)) {
                in[after] -= 1;
                if (in[after] == 0) {
                    queue.offer(after);
                }

            }
        }
        return count == numCourses;
    }

    public static void main(String[] args) {
        Solution207 s = new Solution207();
        System.out.println(s.canFinish(2, new int[][]{{1,0},{0,1}}));
    }
}
