class Solution {
    public int deleteGreatestValue(int[][] grid) {
        boolean[][] gr = new boolean[grid.length][grid[0].length];
        for (boolean[] row : gr) {
            Arrays.fill(row, true);
        }
        int sum = 0;
        while (countTrue(gr) >= 1) {
            int globMax = Integer.MIN_VALUE;
            for (int row = 0; row < gr.length; row++) {
                int max = Integer.MIN_VALUE;
                int rows = -1;
                int cols = -1;
                for (int col = 0; col < gr[row].length; col++) {
                    if (gr[row][col] && grid[row][col] > max) {
                        max = grid[row][col];
                        rows = row;
                        cols = col;
                    }
                }
                gr[rows][cols] = false;
                globMax = Math.max(max, globMax);
            }
            sum += globMax;
        }
        return sum;
    }

    private static int countTrue(boolean[][] arr) {
        int counter = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}