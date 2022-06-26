package com.mmw.jianzhiofffer.搜索与回溯算法;

public class Solution13 {
    public static int movingCount(int m, int n, int k) {
        int[][] temp = new int[m][n];
        return dfs(0, 0, m, n, temp, k);
    }

    private static int dfs(int i, int j, int m, int n, int[][] temp, int k) {
        if(i < 0 || i >= m || j < 0 || j >= n || temp[i][j] == 1 || check(i) + check(j) > k){
            return 0;
        }
        temp[i][j] = 1;
        return 1 + dfs(i - 1, j, m, n, temp, k) +
                dfs(i, j - 1, m, n, temp, k) +
                dfs(i + 1, j, m, n, temp, k) +
                dfs(i, j + 1, m, n, temp, k);
    }

    private static int check(int i) {
        int sum = 0;
        while (i > 0){
            sum += (i % 10);
            i = i / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(1,2,1));
    }
}
