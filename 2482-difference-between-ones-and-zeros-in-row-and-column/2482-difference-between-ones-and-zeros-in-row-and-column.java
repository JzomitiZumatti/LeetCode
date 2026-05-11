class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];
        int[] onesInRow = new int[grid.length];
        int[] onesInCol = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    onesInRow[i]++;
                    onesInCol[j]++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans[i][j] = onesInRow[i] + onesInCol[j] - (grid.length - onesInRow[i]) - (grid[0].length - onesInCol[j]);
            }
        }
        return ans;
    }
}