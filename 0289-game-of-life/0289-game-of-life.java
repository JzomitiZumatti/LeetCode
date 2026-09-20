class Solution {
    public void gameOfLife(int[][] board) {
        int[][] copy = Arrays.stream(board)
                .map(row -> Arrays.copyOf(row, row.length))
                .toArray(int[][]::new);
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                int curr = copy[i][j];
                int live = checkLivesNeighbors(copy, i, j);
                if (curr == 1) {
                    if (live >= 2 && live <= 3) board[i][j] = 1;
                    else board[i][j] = 0;
                } else {
                    if (live == 3) board[i][j] = 1;
                }
            }
        }
    }

    private static int checkLivesNeighbors(int[][] board, int x, int y) {
        int ans = 0;
        int xMin = Math.max(x - 1, 0);
        int xMax = Math.min(x + 1, board.length - 1);
        int yMin = Math.max(y - 1, 0);
        int yMax = Math.min(y + 1, board[0].length - 1);
        for (int i = xMin; i <= xMax; i++) {
            for (int j = yMin; j <= yMax; j++) {
                if (!(i == x && j == y) && board[i][j] == 1) ans++;
            }
        }
        return ans;
    }
}