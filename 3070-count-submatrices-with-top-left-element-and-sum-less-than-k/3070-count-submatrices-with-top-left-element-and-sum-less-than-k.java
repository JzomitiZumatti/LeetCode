class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int res = 0;
        int[][] prefSum = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) prefSum[i][j] = grid[i][j];
                else if (i == 0) prefSum[i][j] = prefSum[i][j - 1] + grid[i][j];
                else if (j == 0) prefSum[i][j] = prefSum[i - 1][j] + grid[i][j];
                else prefSum[i][j] = prefSum[i - 1][j] + grid[i][j] + prefSum[i][j - 1] - prefSum[i - 1][j - 1];
                if (prefSum[i][j] <= k) res++;
            }
        }
        return res;
    }
}