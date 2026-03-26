class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long totalSum = 0;
        long topSum = 0;
        long leftSum = 0;
        int n = grid.length;
        int m = grid[0].length;
        long[] rowSum = new long[n];
        long[] colSum = new long[m];
        Map<Integer, Integer> top = new HashMap<>();
        Map<Integer, Integer> bot = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalSum += grid[i][j];
                bot.put(grid[i][j], bot.getOrDefault(grid[i][j], 0) + 1);
                rowSum[i] += grid[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                right.put(grid[j][i], right.getOrDefault(grid[j][i], 0) + 1);
                colSum[i] += grid[j][i];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                top.put(grid[i][j], top.getOrDefault(grid[i][j], 0) + 1);
                bot.put(grid[i][j], bot.getOrDefault(grid[i][j], 0) - 1);
                if (top.get(grid[i][j]) == 0) top.remove(grid[i][j]);
                if (bot.get(grid[i][j]) == 0) bot.remove(grid[i][j]);
            }
            topSum += rowSum[i];
            long botSum = totalSum - topSum;
            long diff = Math.abs(topSum - botSum);
            if (diff == 0) return true;
            if (topSum > botSum) {
                if (diff <= 100000 && top.containsKey((int) diff)) {
                    if ((i > 0 && m > 1) || grid[0][0] == (int) diff || grid[0][m - 1] == (int) diff)
                        return true;
                }
            } else {
                if (diff <= 100000 && bot.containsKey((int) diff)) {
                    int firstBotRow = i + 1;
                    boolean botMultiRow = (n - 1 - firstBotRow) > 0;
                    if ((botMultiRow && m > 1) || grid[n - 1][0] == (int) diff || grid[n - 1][m - 1] == (int) diff
                            || grid[firstBotRow][0] == (int) diff || grid[firstBotRow][m - 1] == (int) diff)
                        return true;
                }
            }
        }


        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                left.put(grid[j][i], left.getOrDefault(grid[j][i], 0) + 1);
                right.put(grid[j][i], right.getOrDefault(grid[j][i], 0) - 1);
                if (left.get(grid[j][i]) == 0) left.remove(grid[j][i]);
                if (right.get(grid[j][i]) == 0) right.remove(grid[j][i]);
            }
            leftSum += colSum[i];
            long rightSum = totalSum - leftSum;
            long diff = Math.abs(rightSum - leftSum);
            if (diff == 0) return true;
            if (leftSum > rightSum) {
                if (diff <= 100000 && left.containsKey((int) diff)) {
                    if ((i > 0 && n > 1) || grid[0][0] == (int) diff || grid[n - 1][0] == (int) diff
                            || grid[0][i] == (int) diff || grid[n - 1][i] == (int) diff)
                        return true;
                }
            } else {
                if (diff <= 100000 && right.containsKey((int) diff)) {
                    int firstRightCol = i + 1;
                    boolean rightMultiCol = (m - 1 - firstRightCol) > 0;
                    if ((rightMultiCol && n > 1) || grid[n - 1][0] == (int) diff || grid[n - 1][m - 1] == (int) diff
                            || grid[0][firstRightCol] == (int) diff || grid[n - 1][firstRightCol] == (int) diff)
                        return true;
                }
            }
        }

        return false;
    }
}