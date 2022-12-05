package src.com.mmw.leetcode_2022_11.数学;

import java.util.Arrays;

public class Solution338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n ; i++) {
            int temp = countBit(i);
            res[i] = temp;
        }
        return res;
    }

    private int countBit(int i) {
        int count = 0;
        while (i > 0) {
            i = i & (i - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution338 s = new Solution338();
        System.out.println(s.countBit(2));
        System.out.println(Arrays.toString(s.countBits(2)));
    }
}
