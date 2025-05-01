class Solution {
    public int maxProfit(int[] prices) {
        int profit;
        int maxAllProfit = 0;

        if (prices.length == 1) {
            return 0;
        }
        for (int i = 0, j = 1; i < prices.length - 1 && j < prices.length; i++, j++) {
            if (prices[i] < prices[j]) {
                profit = prices[j] - prices[i];
                maxAllProfit += profit;
            }
        }
        return maxAllProfit;
    }
}