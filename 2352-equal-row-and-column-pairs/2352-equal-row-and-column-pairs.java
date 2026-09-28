class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        List<int[]> rows = new ArrayList<>();
        List<int[]> cols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] temp1 = new int[grid[0].length];
            int[] temp2 = new int[grid.length];
            for (int j = 0; j < n; j++) {
                temp1[j] = grid[i][j];
                temp2[j] = grid[j][i];
            }
            rows.add(temp1);
            cols.add(temp2);
        }
        for (int[] row : rows) {
            for (int[] col : cols) {
                if (Arrays.equals(row, col)) ans++;
            }
        }
        return ans;
    }
}