class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        Map<Integer, int[]> row = new HashMap<>();
        Map<Integer, int[]> col = new HashMap<>();
        for (int i = 0, k = 0; i < grid.length && k < grid[0].length; i++, k++) {
            int[] temp1 = new int[grid[0].length];
            int[] temp2 = new int[grid.length];
            for (int j = 0, l = 0; j < grid[i].length && l < grid.length; j++, l++) {
                temp1[j] = grid[i][j];
                temp2[l] = grid[l][k];
            }
            row.put(i, temp1);
            col.put(k, temp2);
        }
        for (int[] rows : row.values()) {
            for (int[] cols : col.values()) {
                if (Arrays.equals(rows, cols)) ans++;
            }
        }
        return ans;
    }
}