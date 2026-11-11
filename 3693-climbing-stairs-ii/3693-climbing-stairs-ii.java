class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[costs.length + 1];
        int i = 0;
        dp[i] = 0;
        i++;
        for (int j = 0; j < costs.length; j++) {
            int currentStair = j + 1;
            int a = dp[i - 1] + costs[j] + (int) Math.pow((currentStair - (i - 1)), 2);
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
            if (i - 2 >= 0) b = dp[i - 2] + costs[j] + (int) Math.pow((currentStair - (i - 2)), 2);
            if (i - 3 >= 0) c = dp[i - 3] + costs[j] + (int) Math.pow((currentStair - (i - 3)), 2);
            dp[i] = Math.min(a, Math.min(b, c));
            i++;
        }
        return dp[n];
    }
}