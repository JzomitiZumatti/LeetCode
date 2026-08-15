class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            int a = moves[i][0];
            int b = moves[i][1];
            if (i % 2 == 0) board[a][b] = 'X';
            else board[a][b] = 'O';
        }
        int counter = 0;
        int xCounter = 0;
        int oCounter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    xCounter++;
                    counter++;
                }
                if (board[i][j] == 'O') {
                    oCounter++;
                    counter++;
                }
            }
            if (xCounter == 3) return "A";
            if (oCounter == 3) return "B";
            xCounter = 0;
            oCounter = 0;
        }

        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 'X') xCounter++;
                if (board[j][i] == 'O') oCounter++;
            }
            if (xCounter == 3) return "A";
            if (oCounter == 3) return "B";
            xCounter = 0;
            oCounter = 0;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') xCounter++;
            if (board[i][i] == 'O') oCounter++;
        }
        if (xCounter == 3) return "A";
        if (oCounter == 3) return "B";
        xCounter = 0;
        oCounter = 0;

        for (int i = 0; i < board.length; i++) {
            if (board[i][board.length - 1 - i] == 'X') xCounter++;
            if (board[i][board.length - 1 - i] == 'O') oCounter++;
        }
        if (xCounter == 3) return "A";
        if (oCounter == 3) return "B";
        return counter < 9 ? "Pending" : "Draw";
    }
}