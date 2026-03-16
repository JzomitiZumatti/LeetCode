class Solution {
    public int[] getBiggestThree(int[][] grid) {
        TreeSet<Integer> sum = new TreeSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum.add(grid[i][j]);
                int r = 1;
                while (checkIfPossible(grid, r, i, j)) {
                    sum.add(sumOfRhombus(grid, r, i, j));
                    r++;
                }
            }
        }
        int length = Math.min(sum.size(), 3);
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = sum.pollLast();
        }
        return res;
    }

    private static boolean checkIfPossible(int[][] grid, int r, int i, int j) {
        if (i + 2 * r >= grid.length) return false;
        if (j - r < 0) return false;
        if (j + r >= grid[i].length) return false;
        return true;
    }

    private static int sumOfRhombus(int[][] grid, int r, int i, int j) {
        int sum = 0;
        //left top diagonal
        for (int k = 0; k <= r; k++) {
            sum += grid[i + k][j - k];
        }
        //right top diagonal
        for (int k = 1; k <= r; k++) {
            sum += grid[i + k][j + k];
        }
        //left bottom diagonal
        for (int k = 0; k < r; k++) {
            sum += grid[i + 2 * r - k][j - k];
        }
        //right bottom diagonal
        for (int k = 1; k < r; k++) {
            sum += grid[i + 2 * r - k][j + k];
        }
        return sum;
    }
}