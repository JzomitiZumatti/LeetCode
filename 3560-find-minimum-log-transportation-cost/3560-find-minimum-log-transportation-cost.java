class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if (n <= k && m <= k) return 0;
        long cost = 0;
        long max = Math.max(n, m);
        while (max > k) {
            if (max - k >= 0) {
                max -= k;
                cost += max * k;
            }
        }
        return cost;
    }
}