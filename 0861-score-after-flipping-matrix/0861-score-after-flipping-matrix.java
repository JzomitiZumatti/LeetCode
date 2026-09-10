class Solution {
    public int matrixScore(int[][] grid) {
        int ans = 0;

        int i = 0;
        while (i < grid.length) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = grid[i][j] == 0 ? 1 : 0;
                }
            }
            i++;
        }
        i = 0;
        while (i < grid[0].length) {
            int ones = 0;
            int zeros = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 0) zeros++;
                else ones++;
            }
            if (zeros > ones) {
                for (int j = 0; j < grid.length; j++) {
                    grid[j][i] = grid[j][i] == 0 ? 1 : 0;
                }
            }
            i++;
        }

        for (int j = 0; j < grid.length; j++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int k = 0; k < grid[j].length; k++) {
                stringBuilder.append(grid[j][k]);
            }
            ans += Integer.parseInt(stringBuilder.toString(), 2);
        }
        return ans;
    }
}