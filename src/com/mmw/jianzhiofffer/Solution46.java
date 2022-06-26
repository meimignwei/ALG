package com.mmw.jianzhiofffer;

public class Solution46 {
    public static int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        if (s.length() <= 2){
            if (num == 0) return 1;
            if (s.length() == 1) return 1;
            if (s.length() == 2){
                if(Integer.parseInt(s.substring(0,2)) <= 25 && Integer.parseInt(s.substring(0,2)) >= 10){
                    return  2;
                }else{
                    return 1;
                }
            }
        }
        dp[0] = 1;
        if(Integer.parseInt(s.substring(0,2)) <= 25 && Integer.parseInt(s.substring(0,2)) >= 10){
            dp[1] = 2;
        }else{
            dp[1] = 1;
        }
        for (int i = 2; i < s.length(); i++) {
            if (Integer.parseInt(s.substring(i-1,i+1)) <= 25 && Integer.parseInt(s.substring(i-1,i+1)) >= 10){
                dp[i] = dp[i - 1] + dp[i - 2];
            }else{
                dp[i] = Math.max(dp[i - 2],dp[i-1]);
            }

        }
        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }

}
