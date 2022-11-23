package src.com.mmw.jianzhi;

public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bo = matrix.length - 1;
        int index = 0;
        int[] res = new int[(right + 1) * (bo + 1)];
        while (true) {
            for (int i = left; i <= right ; i++) {
                res[index++] = matrix[top][i];
            }
            top += 1;
            if (top > bo) break;
            for (int i = top; i <= bo ; i++) {
                res[index++] = matrix[i][right];
            }
            right -= 1;
            if (left > right) break;
            for (int i = right; i >= left ; i--) {
                res[index++] = matrix[bo][i];
            }
            bo -= 1;
            if (top > bo) break;
            for (int i = bo; i >= top ; i--) {
                res[index++] = matrix[i][left];
            }
            left += 1;
            if (left > right) break;
        }
        return res;
    }

}
