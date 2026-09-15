class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double sum = 0.00;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length - 1;
        int j = discounts.length - 1;
        while (j >= 0 && i >= 0) {
            double priceWithDiscount = (double) (prices[i] * (100 - discounts[j])) / 100;
            sum += priceWithDiscount;
            i--;
            j--;
        }
        for (int k = 0; k <= i; k++) {
            sum += prices[k];
        }
        return sum;
    }
}