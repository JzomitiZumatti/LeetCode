class Solution {
    public int maxSum(int[][] grid) {
        int[][] prefSum = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                prefSum[i][j] = j == 0 ? grid[i][j] : prefSum[i][j - 1] + grid[i][j];
            }
        }
        int maxSum = 0;
        for (int i = 2; i < prefSum.length; i++) {
            for (int j = 2; j < prefSum[0].length; j++) {
                int sum = j - 2 == 0 ? prefSum[i - 2][j] + grid[i - 1][j - 1] + prefSum[i][j] :
                        prefSum[i - 2][j] - prefSum[i - 2][j - 2 - 1] + grid[i - 1][j - 1] + prefSum[i][j] -
                        prefSum[i][j - 2 - 1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}