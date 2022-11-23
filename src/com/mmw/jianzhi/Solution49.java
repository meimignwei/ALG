package src.com.mmw.jianzhi;

import java.util.Arrays;

public class Solution49 {
    public int nthUglyNumber(int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int l = 1; l < n ; l++) {
            dp[l] = Math.min(dp[i] * 2, Math.min(dp[j] * 3, dp[k] * 5));
            if (dp[l] == dp[i] * 2) {
                i += 1;
            }
            //注意这里if,不是else if,否则会出现[1, 2, 3, 4, 5, 6, 6, 8, 9, 10]重复现象
            if (dp[l] == dp[j] * 3) {
                j += 1;
            }
            if(dp[l] == dp[k] * 5) {
                k += 1;
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Solution49 s = new Solution49();
        System.out.println(s.nthUglyNumber(10));
    }

}
