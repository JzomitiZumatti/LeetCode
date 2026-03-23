class Solution {
    public int maxProductPath(int[][] grid) {
        final long MOD = 1000000007L;
        int n = grid.length;
        int m = grid[0].length;
        long[][] dp_min = new long[n][m];
        long[][] dp_max = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = grid[i][j];
                if (i == 0 && j == 0) {
                    dp_min[i][j] = val;
                    dp_max[i][j] = val;
                } else if (i == 0) {
                    dp_min[i][j] = Math.min(dp_min[i][j - 1] * val, dp_max[i][j - 1] * val);
                    dp_max[i][j] = Math.max(dp_min[i][j - 1] * val, dp_max[i][j - 1] * val);
                } else if (j == 0) {
                    dp_min[i][j] = Math.min(dp_min[i - 1][j] * val, dp_max[i - 1][j] * val);
                    dp_max[i][j] = Math.max(dp_min[i - 1][j] * val, dp_max[i - 1][j] * val);
                } else {
                    dp_min[i][j] = Math.min(Math.min(dp_min[i - 1][j] * val, dp_max[i - 1][j] * val),
                            Math.min(dp_min[i][j - 1] * val, dp_max[i][j - 1] * val));
                    dp_max[i][j] = Math.max(Math.max(dp_min[i - 1][j] * val, dp_max[i - 1][j] * val),
                            Math.max(dp_min[i][j - 1] * val, dp_max[i][j - 1] * val));
                }
            }
        }
        return dp_max[n - 1][m - 1] < 0 ? -1 : (int) (dp_max[n - 1][m - 1] % MOD);
    }
}