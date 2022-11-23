package src.com.mmw.jianzhi.动态规划;

public class Solution47 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int clo = grid[0].length;
        for (int i = 1; i < row; i++) {
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < clo; i++) {
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < clo; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[row - 1][clo - 1];
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Solution47 s = new Solution47();
        System.out.println(s.maxValue(a));
    }
}
