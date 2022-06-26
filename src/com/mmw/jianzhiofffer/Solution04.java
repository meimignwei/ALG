package com.mmw.jianzhiofffer;

public class Solution04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length ==0) return false;
        int x = matrix.length;
        int y = matrix[0].length;
        boolean flag = false;
        int top = 0;
        int right = y - 1;
        while (top < x && right >=0){
            if (matrix[top][right] > target) right -= 1;
            else if (matrix[top][right] < target) top += 1;
            else if (matrix[top][right] == target) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
