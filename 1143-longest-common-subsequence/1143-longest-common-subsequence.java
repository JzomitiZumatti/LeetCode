class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        String max = text1.length() >= text2.length() ? text1 : text2;
        String min = text1.length() < text2.length() ? text1 : text2;
        int[][] dp = new int[min.length() + 1][max.length() + 1];
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j < max.length(); j++) {
                char c1 = min.charAt(i);
                char c2 = max.charAt(j);
                if (c1 == c2) dp[i + 1][j + 1] = dp[i][j] + 1;
                else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}