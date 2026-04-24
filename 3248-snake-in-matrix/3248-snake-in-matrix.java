class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] matrix = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = k;
                k++;
            }
        }
        int row = 0;
        int col = 0;
        for (String command : commands) {
            if (command.equals("DOWN")) row++;
            if (command.equals("UP")) row--;
            if (command.equals("RIGHT")) col++;
            if (command.equals("LEFT")) col--;
        }
        return matrix[row][col];
    }
}