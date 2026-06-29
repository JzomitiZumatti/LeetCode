class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            int prev = grid[0][i];
            for (int[] ints : grid) {
                if (prev != ints[i]) return false;
            }
        }
        for (int[] ints : grid) {
            for (int j = 1; j < ints.length; j++) {
                if (ints[j - 1] == ints[j]) return false;
            }
        }
        return true;
    }
}