class Solution {
    public int countServers(int[][] grid) {
        int ans = 0;
        int isolated = 0;
        int[] rowCounter = new int[grid.length];
        int[] colCounter = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int counter = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    counter++;
                }
            }
            rowCounter[i] = counter;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int counter = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) {
                    counter++;
                }
            }
            colCounter[i] = counter;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans++;
                    if (rowCounter[i] == 1 && colCounter[j] == 1) {
                        isolated++;
                    }
                }
            }
        }
        return ans - isolated;
    }
}