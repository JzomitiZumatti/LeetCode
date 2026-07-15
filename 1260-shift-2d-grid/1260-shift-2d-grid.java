class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k > 0) {
            int[][] newGrid = new int[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (i == grid.length - 1 && j == grid[i].length - 1) newGrid[0][0] = grid[i][j];
                    else if (j == grid[i].length - 1) newGrid[i + 1][0] = grid[i][j];
                    else newGrid[i][j + 1] = grid[i][j];
                }
            }
            grid = Arrays.copyOf(newGrid, newGrid.length);
            k--;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] ints : grid) {
            List<Integer> temp = new ArrayList<>();
            for (int anInt : ints) {
                temp.add(anInt);
            }
            ans.add(temp);
        }
        return ans;
    }
}