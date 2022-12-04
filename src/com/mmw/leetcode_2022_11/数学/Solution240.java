package src.com.mmw.leetcode_2022_11.数学;

public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int clo = matrix[0].length;
        int right = clo-1;
        int top = 0;
        while (top < row && right >= 0) {
            if (matrix[top][right] == target) {
                return true;
            } else if (matrix[top][right] > target) {
                right -= 1;
            } else {
                top += 1;
            }
        }
        return false;
    }

}
