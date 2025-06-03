class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minAmount = new int[amount + 1];
        Arrays.fill(minAmount, amount + 1);
        minAmount[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    minAmount[i] = Math.min(minAmount[i], minAmount[i - coin] + 1);
                }
            }
        }
        return minAmount[amount] > amount ? -1 : minAmount[amount];
    }
}