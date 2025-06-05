class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCostForEachStep = new int[cost.length + 1];
        minCostForEachStep[0] = 0;
        minCostForEachStep[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            minCostForEachStep[i] = Math.min(minCostForEachStep[i - 1] + cost[i - 1],
                    minCostForEachStep[i - 2] + cost[i - 2]);
        }
        return minCostForEachStep[cost.length];
    }
}