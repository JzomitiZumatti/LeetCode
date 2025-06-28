class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        int counter = 0;
        dp[0] = 1;
        while (counter < coins.length) {
            for (int i = coins[counter]; i <= amount; i++) {
                dp[i] += dp[i - coins[counter]];
            }
            counter++;
        }
        return dp[amount];
    }
}