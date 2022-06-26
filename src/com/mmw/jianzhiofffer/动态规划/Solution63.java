package com.mmw.jianzhiofffer.动态规划;

public class Solution63 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 0) return 0;
        int min = prices[0];
        for(int price:prices){
            min = Math.min(price, min);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

}
