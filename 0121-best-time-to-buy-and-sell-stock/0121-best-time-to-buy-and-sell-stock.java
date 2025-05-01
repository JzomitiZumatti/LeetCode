class Solution {
    public int maxProfit(int[] prices) {
        int profit;
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        if (prices.length == 1) {
            return 0;
        }
        for (int price : prices) {
            minPriceSoFar = minPriceSoFar < price ? minPriceSoFar : price;
            profit = price - minPriceSoFar;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}