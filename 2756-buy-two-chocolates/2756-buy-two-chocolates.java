class Solution {
    public int buyChoco(int[] prices, int money) {
        int counter = 0;
        int i = 0;
        int moneyAfterBuy = money;
        Arrays.sort(prices);
        while (i < prices.length) {
            if (prices[i] <= moneyAfterBuy) {
                moneyAfterBuy -= prices[i];
                counter++;
                if (counter == 2) {
                    return moneyAfterBuy;
                }
            } else {
                return money;
            }
            i++;
        }
        return money;
    }
}