import java.util.*;

public class L3963_Create_Grid_With_Exactly_One_Path {
    // Using Grid Construction
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }
        Arrays.fill(grid[0], '.');
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }
        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }
        return ans;
    }
}
