class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD = 12345;
        int n = grid.length;
        int m = grid[0].length;

        int[][] pref = new int[n][m];
        int[][] suf = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    pref[i][j] = grid[i][j];
                } else if (i == 0) {
                    pref[i][j] = (int)(((long) pref[i][j - 1] * grid[i][j]) % MOD);
                } else if (j == 0) {
                    pref[i][j] = (int)(((long) pref[i - 1][m - 1] * grid[i][j]) % MOD);
                } else {
                    pref[i][j] = (int)(((long) pref[i][j - 1] * grid[i][j]) % MOD);
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    suf[i][j] = grid[i][j];
                } else if (i == n - 1) {
                    suf[i][j] = (int)(((long) suf[i][j + 1] * grid[i][j]) % MOD);
                } else if (j == m - 1) {
                    suf[i][j] = (int)(((long) suf[i + 1][0] * grid[i][j]) % MOD);
                } else {
                    suf[i][j] = (int)(((long) suf[i][j + 1] * grid[i][j]) % MOD);
                }
            }
        }

        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int prefix = 1;
                int sufix = 1;
                if (i == 0 && j == 0) prefix = 1;
                else if (j == 0) prefix = (i - 1 >= 0) ? pref[i - 1][m - 1] : 1;
                else prefix = pref[i][j - 1];

                if (i == n - 1 && j == m - 1) sufix = 1;
                else if (j == m - 1) sufix = (i + 1 < n) ? suf[i + 1][0] : 1;
                else sufix = suf[i][j + 1];

                res[i][j] = (int)(((long) prefix * sufix) % MOD);
            }
        }

        return res;
    }
}