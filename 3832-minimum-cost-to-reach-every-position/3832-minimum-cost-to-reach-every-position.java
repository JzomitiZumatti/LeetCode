class Solution {
    public int[] minCosts(int[] cost) {
        for (int i = 0; i < cost.length - 1; i++) {
            if (cost[i + 1] > cost[i]) cost[i + 1] = cost[i];
        }
        return cost;
    }
}