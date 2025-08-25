package letcode;

public class SpiralMatrixII {
    // LeetCode 59: Spiral Matrix II
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;
            for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
            left++;
        }
        return matrix;
    }
}
