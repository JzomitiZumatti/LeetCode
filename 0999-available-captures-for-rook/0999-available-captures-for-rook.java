class Solution {
    public int numRookCaptures(char[][] board) {
        int[][] rCoord = new int[1][2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rCoord[0][0] = i;
                    rCoord[0][1] = j;
                    break;
                }
            }
        }
        int ans = 0;
        int row = rCoord[0][0] - 1;
        int col = rCoord[0][1];
        while (row >= 0) {
            if (board[row][col] == 'p') {
                ans++;
                break;
            } else if (board[row][col] == 'B') break;
            row--;
        }
        row = rCoord[0][0] + 1;
        while (row < board.length) {
            if (board[row][col] == 'p') {
                ans++;
                break;
            } else if (board[row][col] == 'B') break;
            row++;
        }
        row = rCoord[0][0];
        col = rCoord[0][1] - 1;
        while (col >= 0) {
            if (board[row][col] == 'p') {
                ans++;
                break;
            } else if (board[row][col] == 'B') break;
            col--;
        }
        col = rCoord[0][1] + 1;
        while (col < board[0].length) {
            if (board[row][col] == 'p') {
                ans++;
                break;
            } else if (board[row][col] == 'B') break;
            col++;
        }
        return ans;
    }
}