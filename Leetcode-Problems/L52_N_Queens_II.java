public class L52_N_Queens_II {
    // Using Recursion, Backtracking, and Boolean Arrays
    public int totalNQueens(int n) {
        return solve(0, n, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
    }

    private int solve(int row, int n, boolean[] col, boolean[] diag1, boolean[] diag2) {
        if (row == n) return 1;
        int count = 0;
        for (int c = 0; c < n; c++) {
            int d1 = row - c + n - 1;
            int d2 = row + c;
            if (!col[c] && !diag1[d1] && !diag2[d2]) {
                col[c] = diag1[d1] = diag2[d2] = true;
                count += solve(row + 1, n, col, diag1, diag2);
                col[c] = diag1[d1] = diag2[d2] = false;
            }
        }
        return count;
    }
}
