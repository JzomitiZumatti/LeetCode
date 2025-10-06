class Solution {
    public int swimInWater(int[][] grid) {
        return checkWaterHeights(grid);
    }

    private static int checkWaterHeights(int[][] grid) {
        PriorityQueue<int[]> heights = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        heights.add(new int[]{0, 0, grid[0][0]});
        visited[0][0] = true;
        int max;
        while (!heights.isEmpty()) {
            int[] current = heights.poll();
            int c = current[0];
            int r = current[1];
            int height = current[2];
            if (c == grid.length - 1 && r == grid[0].length - 1) {
                return height;
            }

            if (c - 1 >= 0 && !visited[c - 1][r]) {
                max = Math.max(height, grid[c - 1][r]);
                heights.add(new int[]{c - 1, r, max});
                visited[c - 1][r] = true;
            }
            if (c + 1 < grid.length && !visited[c + 1][r]) {
                max = Math.max(height, grid[c + 1][r]);
                heights.add(new int[]{c + 1, r, max});
                visited[c + 1][r] = true;
            }
            if (r - 1 >= 0 && !visited[c][r - 1]) {
                max = Math.max(height, grid[c][r - 1]);
                heights.add(new int[]{c, r - 1, max});
                visited[c][r - 1] = true;
            }
            if (r + 1 < grid[0].length && !visited[c][r + 1]) {
                max = Math.max(height, grid[c][r + 1]);
                heights.add(new int[]{c, r + 1, max});
                visited[c][r + 1] = true;
            }
        }
        return -1;
    }
}