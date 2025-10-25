class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int weeks = n / 7;
        int days = n % 7;
        int sumOfFirstWeek = 28;
        if (weeks >= 1) {
            for (int i = sumOfFirstWeek; i <= sumOfFirstWeek + (7 * (weeks - 1)); i += 7) {
                sum += i;
            }
        }
        for (int i = weeks + 1; i <= weeks + days; i++) {
            sum += i;
        }
        return sum;
    }
}