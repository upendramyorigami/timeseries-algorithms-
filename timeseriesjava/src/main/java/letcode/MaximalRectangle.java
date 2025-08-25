package letcode;

public class MaximalRectangle {
    // LeetCode 85: Maximal Rectangle
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int max = 0, n = matrix[0].length;
        int[] heights = new int[n];
        for (char[] row : matrix) {
            for (int i = 0; i < n; i++) {
                heights[i] = row[i] == '1' ? heights[i] + 1 : 0;
            }
            max = Math.max(max, largestRectangleArea(heights));
        }
        return max;
    }
    private int largestRectangleArea(int[] heights) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int max = 0, n = heights.length;
        for (int i = 0; i <= n; i++) {
            int h = i == n ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        return max;
    }
}
