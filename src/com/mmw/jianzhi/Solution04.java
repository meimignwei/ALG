package src.com.mmw.jianzhi;

public class Solution04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int row = matrix.length;
        int clo = matrix[0].length;
        int i = 0;
        int j = clo-1;
        while (i < row && j >= 0) {
            if (i < row && j >= 0  && matrix[i][j] > target) {
                j--;
            } else if (i < row && j >= 0 && matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }

}
