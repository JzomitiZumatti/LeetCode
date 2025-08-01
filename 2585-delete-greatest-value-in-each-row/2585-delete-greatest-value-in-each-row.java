class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        int sum = 0;
        int counter = 0;
        int i = 1;
        while (counter < grid[0].length) {
            int globMax = Integer.MIN_VALUE;
            for (int row = 0; row < grid.length; row++) {
                globMax = Math.max(globMax, grid[row][grid[row].length - i]);
            }
            i++;
            counter++;
            sum += globMax;
        }
        return sum;
    }
}