class Solution {
    public int projectionArea(int[][] grid) {
        int ans = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt > 0) ans++;
            }
        }
        for (int[] g : grid) {
            int max = 0;
            for (int i : g) {
                max = Math.max(max, i);
            }
            ans += max;
        }
        int i = 0;
        while (i < grid[0].length) {
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[i]);
            }
            ans += max;
            i++;
        }
        return ans;
    }
}