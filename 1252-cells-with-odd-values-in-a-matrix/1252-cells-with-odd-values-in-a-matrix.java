class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for (int i = 0; i < matrix[row].length; i++) {
                matrix[row][i] += 1;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] += 1;
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) counter++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return counter;
    }
}