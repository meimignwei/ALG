package src.com.mmw.leetcode_2022_11.数学;

import java.util.Arrays;

public class Solution48 {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int clo = matrix[0].length;
        for (int i = 0; i < row/2; i++) {
            for (int j = 0; j < clo; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - 1 - i][j] ;
                matrix[row - 1 - i][j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < row; i++) {
            //注意这里j <= i
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        Solution48 s = new Solution48();
        s.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
