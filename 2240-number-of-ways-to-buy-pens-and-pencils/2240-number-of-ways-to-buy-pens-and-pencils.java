class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0;
        for (int i = 0; i <= total / cost1; i++) {
            long price = cost1 * i;
            ans += ((total - price) / cost2) + 1;
        }
        return ans;
    }
}