class Solution {
    public int maxProfit(int[] prices) {
        int profit;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        if (prices.length == 1) {
            return 0;
        }
        for (int price : prices) {
            minPrice = minPrice < price ? minPrice : price;
            profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}