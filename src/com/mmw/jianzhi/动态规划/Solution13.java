package src.com.mmw.jianzhi.动态规划;

public class Solution13 {
    public int movingCount(int m, int n, int k) {
        int[][] board = new int[m][n];
        return dfs(m,n,0, 0, k,board);
    }

    private int dfs(int m, int n, int i, int j, int k,int[][] board) {
        //此处注意条件
        if (i >= m || j >= n || i < 0 || j < 0 || board[i][j] == 1 || check(i, j, k)) {
            return 0;
        }
        board[i][j] = 1;
        return 1 + dfs(m, n, i + 1, j, k, board)
                + dfs(m, n, i - 1, j, k, board)
                + dfs(m, n, i, j - 1, k, board)
                + dfs(m, n, i, j + 1, k, board);
    }

    private boolean check(int i, int j, int k) {
        int res = 0;
        while (i > 0) {
            res += (i % 10);
            i = i / 10;
        }
        while (j > 0) {
            res += (j % 10);
            j = j / 10;
        }
        //等于也是可以的
        return res - k > 0;
    }

    public static void main(String[] args) {
        Solution13 s = new Solution13();
        System.out.println(s.check(23,82,2));
        System.out.println(s.movingCount(2,3,1));
    }

}
