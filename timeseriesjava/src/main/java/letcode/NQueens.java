package letcode;

public class NQueens {
    // LeetCode 51: N-Queens
    public java.util.List<java.util.List<String>> solveNQueens(int n) {
        java.util.List<java.util.List<String>> res = new java.util.ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) java.util.Arrays.fill(board[i], '.');
        backtrack(res, board, 0, n);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<String>> res, char[][] board, int row, int n) {
        if (row == n) {
            java.util.List<String> temp = new java.util.ArrayList<>();
            for (char[] r : board) temp.add(new String(r));
            res.add(temp);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                backtrack(res, board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }
    private boolean isValid(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) if (board[i][col] == 'Q') return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) if (board[i][j] == 'Q') return false;
        return true;
    }
}
