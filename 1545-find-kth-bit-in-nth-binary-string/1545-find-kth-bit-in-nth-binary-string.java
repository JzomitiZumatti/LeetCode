class Solution {
    public char findKthBit(int n, int k) {
        String[] dp = new String[n + 1];
        int index = 0;
        dp[0] = "0";
        for (int i = 1; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(dp[i - 1]).append(1);
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < dp[i - 1].length(); j++) {
                int c = dp[i - 1].charAt(j) - '0';
                temp.append(c == 0 ? 1 : 0);
            }
            stringBuilder.append(temp.reverse());
            dp[i] = stringBuilder.toString();
            if (dp[i].length() >= k) {
                index = i;
                break;
            }
        }
        return dp[index].charAt(k - 1);
    }
}