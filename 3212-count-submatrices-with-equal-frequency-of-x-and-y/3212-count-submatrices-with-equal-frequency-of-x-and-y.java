class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int res = 0;
        int rows = grid.length, cols = grid[0].length;
        int[][] prefDiff = new int[rows][cols];
        int[][] prefX    = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int diff = grid[i][j] == 'X' ? 1 : grid[i][j] == 'Y' ? -1 : 0;
                int xVal = grid[i][j] == 'X' ? 1 : 0;

                if (i == 0 && j == 0) {
                    prefDiff[i][j] = diff;
                    prefX[i][j]    = xVal;
                } else if (i == 0) {
                    prefDiff[i][j] = prefDiff[i][j - 1] + diff;
                    prefX[i][j]    = prefX[i][j - 1]    + xVal;
                } else if (j == 0) {
                    prefDiff[i][j] = prefDiff[i - 1][j] + diff;
                    prefX[i][j]    = prefX[i - 1][j]    + xVal;
                } else {
                    prefDiff[i][j] = prefDiff[i-1][j] + prefDiff[i][j-1]
                            - prefDiff[i-1][j-1] + diff;
                    prefX[i][j]    = prefX[i-1][j]    + prefX[i][j-1]
                            - prefX[i-1][j-1]    + xVal;
                }

                if (prefDiff[i][j] == 0 && prefX[i][j] > 0) {
                    res++;
                }
            }
        }
        return res;
    }
}