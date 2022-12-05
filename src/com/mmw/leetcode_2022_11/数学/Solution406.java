package src.com.mmw.leetcode_2022_11.数学;


/*
* 身高按照从高到低
* 第二个元素是从低到高
* */

import java.util.*;
public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        //注意这里需要的是int[]
        List<int[]> ans = new ArrayList<int[]>();
        for (int i = 0; i < people.length; i++) {
            ans.add(people[i][1],people[i]);
        }
        return ans.toArray(new int[ans.size()][]);

    }

    public static void main(String[] args) {
        Solution406 s = new Solution406();
        System.out.println(Arrays.deepToString(s.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}})));
    }

}
