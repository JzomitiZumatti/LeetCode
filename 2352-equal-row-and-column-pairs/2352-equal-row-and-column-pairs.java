class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        Map<List<Integer>, Integer> rowsFreq = new HashMap<>();
        List<List<Integer>> cols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
                col.add(grid[j][i]);
            }
            rowsFreq.merge(row, 1, Integer::sum);
            cols.add(col);
        }
        for (List<Integer> col : cols) {
            if (rowsFreq.containsKey(col)) ans += rowsFreq.get(col);
        }
        return ans;
    }
}