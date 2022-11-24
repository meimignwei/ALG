package src.com.mmw.jianzhi;

import java.util.*;
public class Solution57_2 {
    List<int[]> res = new ArrayList<>();
    public int[][] findContinuousSequence(int target) {
        for (int l = 1, r = 2; l < r; ) {
            int sum = (l + r) * (r - l + 1) / 2;
            if (sum == target) {
                int[] temp = new int[r - l + 1];
                for (int i = l; i <=r ; i++) {
                    temp[i-l] = i;
                }
                res.add(temp);
                l += 1;
            } else if (sum < target) {
                r++;
            } else {
                l++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Solution57_2 s = new Solution57_2();
        System.out.println(Arrays.deepToString(s.findContinuousSequence(9)));
    }

}
