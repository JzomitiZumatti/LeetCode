class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int j = y; j < y + k; j++) {
            int[] temp = new int[k];
            int p = 0;
            for (int i = x; i < x + k; i++) {
                temp[p] = grid[i][j];
                p++;
            }
            int l = 1;
            for (int i = x; i < x + k; i++) {
                grid[i][j] = temp[temp.length - l];
                l++;
            }
        }
        return grid;
    }
}