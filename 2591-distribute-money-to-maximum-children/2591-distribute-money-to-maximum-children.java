class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1;
        money -= children;
        int count = Math.min(money / 7, children);
        if (count == children && money != count * 7) {
            return count - 1;
        }
        if (money % 7 == 3 && count == children - 1) {
            return count - 1;
        }
        return count;
    }
}