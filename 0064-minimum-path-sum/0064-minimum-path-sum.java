class Solution {
    public int minPathSum(int[][] grid) {
        int[][] minSum = new int[grid.length][grid[0].length];
        minSum[0][0] = grid[0][0];
        for (int j = 1; j < grid[0].length; j++) {
            minSum[0][j] = grid[0][j] + minSum[0][j - 1];
        }
        
        for (int i = 1; i < grid.length; i++) {
            minSum[i][0] = grid[i][0] + minSum[i - 1][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                minSum[i][j] = grid[i][j] + Math.min(minSum[i-1][j], minSum[i][j-1]);
            }
        }
        return minSum[minSum.length - 1][minSum[minSum.length - 1].length - 1];
    }
}