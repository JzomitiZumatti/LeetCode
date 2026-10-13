class Solution {
    public boolean exist(char[][] board, String word) {
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        int searchingLetter = 0;
        boolean[][] isUsed = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    backtrack(board, word, isUsed, i, j, searchingLetter, ans, path);
                }
            }
        }
        return !ans.isEmpty();
    }

    private static void backtrack(char[][] board, String word, boolean[][] isUSed, int m, int n, int searchingLetter, List<String> ans, StringBuilder path) {
        if (searchingLetter == word.length()) {
            ans.add(path.toString());
            return;
        }
        char c = board[m][n];
        char letter = word.charAt(searchingLetter);

        if (c == letter && !isUSed[m][n] && ans.isEmpty()) {
            isUSed[m][n] = true;
            path.append(c);
            if (searchingLetter + 1 == word.length()) {
                ans.add(path.toString());
                return;
            }
            if (m + 1 < board.length) {
                backtrack(board, word, isUSed, m + 1, n,  searchingLetter + 1, ans, path);
            }
            if (n + 1 < board[0].length) {
                backtrack(board, word, isUSed, m, n + 1, searchingLetter + 1, ans, path);
            }
            if (m - 1 >= 0) {
                backtrack(board, word, isUSed, m - 1, n, searchingLetter + 1, ans, path);
            }
            if (n - 1 >= 0) {
                backtrack(board, word, isUSed, m, n - 1, searchingLetter + 1, ans, path);
            }
            path.deleteCharAt(path.length() - 1);
            isUSed[m][n] = false;
        }
    }
}