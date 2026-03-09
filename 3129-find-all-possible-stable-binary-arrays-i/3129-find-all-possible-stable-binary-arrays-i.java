class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][][][] dp = new long[zero+1][one+1][2][limit+1];
        for (int i = 0; i < zero + 1; i++) {
            for (int j = 0; j < one + 1; j++) {
                for (int k = 0; k <= 1; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        int last = 0;
        int streak = 0;
        return (int)(dp(zero, one, last, streak, limit, dp));
    }

    private static long dp(int zero, int one, int last, int streak, int limit, long[][][][] dp) {
        int MOD = 1_000_000_007;
        if (zero == 0 && one == 0) return 1;
        if (dp[zero][one][last][streak] != -1) return dp[zero][one][last][streak];

        long counter = 0L;

        if (zero > 0) {
            if (last != 0) counter += dp(zero - 1, one, 0, 1, limit, dp) % MOD;
            else if (streak < limit) counter += dp(zero - 1, one, 0, streak + 1, limit, dp) % MOD;
        }

        if (one > 0) {
            if (last != 1) counter += dp(zero, one - 1, 1, 1, limit, dp) % MOD;
            else if (streak < limit) counter += dp(zero, one - 1, 1, streak + 1, limit, dp) % MOD;
        }

        dp[zero][one][last][streak] = counter % MOD;
        return counter % MOD;
    }
}