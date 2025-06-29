class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 9;
        int k = 2;
        while (k <= n) {
            dp[k] = dp[k - 1] * (10 - (k - 1));
            k++;
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result += dp[i];
        }
        return result;
    }
}