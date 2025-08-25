package letcode;

public class NQueensII {
    // LeetCode 52: N-Queens II
    public int totalNQueens(int n) {
        int[] count = new int[1];
        backtrack(count, new boolean[n], new boolean[2 * n], new boolean[2 * n], 0, n);
        return count[0];
    }
    private void backtrack(int[] count, boolean[] cols, boolean[] d1, boolean[] d2, int row, int n) {
        if (row == n) {
            count[0]++;
            return;
        }
        for (int col = 0; col < n; col++) {
            int id1 = col - row + n, id2 = col + row;
            if (!cols[col] && !d1[id1] && !d2[id2]) {
                cols[col] = d1[id1] = d2[id2] = true;
                backtrack(count, cols, d1, d2, row + 1, n);
                cols[col] = d1[id1] = d2[id2] = false;
            }
        }
    }
}
