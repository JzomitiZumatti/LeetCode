class Solution {
    public int[][] sortMatrix(int[][] grid) {
        List<List<Integer>> leftTriangle = new ArrayList<>();
        List<List<Integer>> rightTriangle = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        int col = 0;
        for (int[] ints : grid) {
            mid.add(ints[col]);
            col++;
        }
        mid.sort(Comparator.reverseOrder());

        int row = 1;
        while (row < grid.length - 1) {
            List<Integer> list = new ArrayList<>();
            int i = row;
            for (int k = 0; k < grid.length - row; k++) {
                list.add(grid[i][k]);
                i++;
            }
            row++;
            list.sort(Comparator.reverseOrder());
            leftTriangle.add(list);
        }

        col = 1;
        while (col < grid.length - 1) {
            List<Integer> list = new ArrayList<>();
            int i = col;
            for (int k = 0; k < grid.length - col; k++) {
                list.add(grid[k][i]);
                i++;
            }
            col++;
            list.sort(Comparator.naturalOrder());
            rightTriangle.add(list);
        }

        col = 0;
        for (int i = 0; i < grid.length; i++) {
            grid[col][i] = mid.get(i);
            col++;
        }

        row = 1;
        while (row < grid.length - 1) {
            int i = row;
            for (int k = 0; k < grid.length - row; k++) {
                grid[i][k] = leftTriangle.get(row - 1).get(k);
                i++;
            }
            row++;
        }

        col = 1;
        while (col < grid.length - 1) {
            int i = col;
            for (int k = 0; k < grid.length - col; k++) {
                grid[k][i] = rightTriangle.get(col - 1).get(k);
                i++;
            }
            col++;
        }

        return grid;
    }
}