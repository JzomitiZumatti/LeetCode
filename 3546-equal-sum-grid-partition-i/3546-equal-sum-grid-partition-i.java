class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long[][] pref_horizontal = new long[n][m];
        long[][] pref_vertical = new long[n][m];

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalSum += grid[i][j];
                if (i == 0 && j == 0) {
                    pref_horizontal[i][j] = grid[i][j];
                } else if (i == 0) {
                    pref_horizontal[i][j] = pref_horizontal[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    pref_horizontal[i][j] = pref_horizontal[i - 1][m - 1] + grid[i][j];
                } else {
                    pref_horizontal[i][j] = pref_horizontal[i][j - 1] + grid[i][j];
                }
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    pref_vertical[j][i] = grid[j][i];
                } else if (j == 0) {
                    pref_vertical[j][i] = pref_vertical[n - 1][i - 1] + grid[j][i];
                } else if (i == 0) {
                    pref_vertical[j][i] = pref_vertical[j - 1][i] + grid[j][i];
                } else {
                    pref_vertical[j][i] = pref_vertical[j - 1][i] + grid[j][i];
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (pref_horizontal[i - 1][m - 1] == totalSum - pref_horizontal[i - 1][m - 1]) return true;
        }

        for (int i = 1; i < m; i++) {
            if (pref_vertical[n - 1][i - 1] == totalSum - pref_vertical[n - 1][i - 1]) return true;
        }

        return false;
    }
}