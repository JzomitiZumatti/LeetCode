class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int balance = 100;
        return balance - ((purchaseAmount + 5) / 10) * 10;
    }
}