class Solution {
    public boolean checkValidString(String s) {
        boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (!dp[i][j]) continue;
                if (c == '(') dp[i + 1][j + 1] = true;
                if (c == ')') {
                    if (j > 0) {
                        dp[i + 1][j - 1] = true;
                    }
                }
                if (c == '*') {
                    dp[i + 1][j] = true;
                    dp[i + 1][j + 1] = true;
                    if (j > 0) {
                        dp[i + 1][j - 1] = true;
                    }
                }
            }
        }
        return dp[s.length()][0];
    }
}