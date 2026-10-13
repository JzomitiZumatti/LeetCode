class Solution {
    public boolean exist(char[][] board, String word) {
        int searchingLetter = 0;
        boolean[][] isUsed = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, word, isUsed, i, j, searchingLetter)) return true;
                }
            }
        }
        return false;
    }

    private static boolean backtrack(char[][] board, String word, boolean[][] isUSed, int m, int n, int searchingLetter) {
        if (searchingLetter == word.length()) {
            return true;
        }
        char c = board[m][n];
        char letter = word.charAt(searchingLetter);

        if (c == letter && !isUSed[m][n]) {
            isUSed[m][n] = true;
            if (searchingLetter + 1 == word.length()) {
                isUSed[m][n] = false;
                return true;
            }
            if (m + 1 < board.length) {
                if (backtrack(board, word, isUSed, m + 1, n,  searchingLetter + 1)){
                    isUSed[m][n] = false;
                    return true;
                }
            }
            if (n + 1 < board[0].length) {
                if (backtrack(board, word, isUSed, m, n + 1, searchingLetter + 1)) {
                    isUSed[m][n] = false;
                    return true;
                }
            }
            if (m - 1 >= 0) {
                if (backtrack(board, word, isUSed, m - 1, n, searchingLetter + 1)) {
                    isUSed[m][n] = false;
                    return true;
                }
            }
            if (n - 1 >= 0) {
                if (backtrack(board, word, isUSed, m, n - 1, searchingLetter + 1)) {
                    isUSed[m][n] = false;
                    return true;
                }
            }
            isUSed[m][n] = false;
        }
        return false;
    }
}