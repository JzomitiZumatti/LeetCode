class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        int counter = 1;
        while (counter <= target) {
            for (int num : nums) {
                if (counter - num >= 0) {
                    dp[counter] += dp[counter - num];
                }
            }
            counter++;
        }
        return dp[target];
    }
}