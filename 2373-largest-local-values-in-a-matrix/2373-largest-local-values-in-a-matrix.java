class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}