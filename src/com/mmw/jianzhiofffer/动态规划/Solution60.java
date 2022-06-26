package com.mmw.jianzhiofffer.动态规划;

import java.util.Arrays;

public class Solution60 {
    public static double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp,1/6.0);
        for (int i = 2; i <= n ; i++) {
            double[] temp = new double[5 * i + 1];
            for (int j = 0; j < dp.length ; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] += dp[j] / 6.0;
                }
            }
            dp = temp;
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dicesProbability(2)));
    }
}
