class Solution {
    public int buyChoco(int[] prices, int money) {
        int counter = 0;
        int i = 0;
        Arrays.sort(prices);
        int moneyAfterBuy = money;
        while (i < prices.length) {
            if (prices[i] <= moneyAfterBuy) {
                moneyAfterBuy -= prices[i];
                counter++;
                if (counter == 2) {
                    return moneyAfterBuy;
                }
                i++;
            } else {
                return money;
            }
        }
        return money;
    }
}