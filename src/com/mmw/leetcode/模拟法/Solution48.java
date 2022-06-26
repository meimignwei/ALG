package com.mmw.leetcode.模拟法;
/*
* 方法三：用翻转代替旋转
* 1.水平翻转
* 2.对角线翻转
*/

public class Solution48 {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int clo = matrix[0].length;
        for (int i = 0; i < row/2; i++) {
            for (int j = 0; j < clo; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - i - 1][j];
                matrix[row - i - 1][j] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];

            }
        }
    }

}
