package src.com.mmw.leetcode_2022_11.回溯;

public class Solution200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, char[][] grid) {
        int row = grid.length;
        int clo = grid[0].length;
        if (i < 0 || i >= row || j < 0 || j >= clo || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
    }
}
