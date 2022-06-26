package com.mmw.leetcode.list;

public class Soluition74_搜索二维矩阵 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int clo = matrix[0].length;
        int i = 0;
        int j = clo - 1;
        boolean flag = false;
        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                flag = true;
                break;
            }
            while ( i < row && j >= 0 && matrix[i][j] < target) {
                i += 1;
            }
            while (i < row && j >= 0 && matrix[i][j] > target) {
                j -= 1;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] tmp = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(tmp,13));
    }
}
