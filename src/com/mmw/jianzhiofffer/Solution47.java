package com.mmw.jianzhiofffer;

public class Solution47 {
    public static int maxValue(int[][] grid) {
        int row = grid.length;
        int clo = grid[0].length;
        for (int i = 1; i < row; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < clo; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < clo; j++) {
                grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[row - 1][clo - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(maxValue(grid));
    }
}
