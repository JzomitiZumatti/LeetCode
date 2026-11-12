class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long a = (long) cost1 * need1;
        long b = (long) cost2 * need2;
        long c = (long) costBoth * Math.max(need1, need2);
        long d = 0;
        long minCost = Math.min(costBoth, cost1 + cost2);
        if (need1 > need2) {
            d = minCost * need2 + (long) (need1 - need2) * cost1;
        } else {
            d = minCost * need1 + (long) (need2 - need1) * cost2;
        }
        return Math.min(a + b, Math.min(c, d));
    }
}