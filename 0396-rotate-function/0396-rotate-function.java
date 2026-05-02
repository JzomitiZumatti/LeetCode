class Solution {
    public int maxRotateFunction(int[] nums) {
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int k = 0;
        int genSum = 0;
        for (int i = 0; i < nums.length; i++) {
            genSum += nums[i];
            dp[k] += i * nums[i];
        }
        max = Math.max(max, dp[k]);
        k++;
        while (k < nums.length) {
            dp[k] = dp[k - 1] + genSum - nums.length * nums[nums.length - k];
            max = Math.max(max, dp[k]);
            k++;
        }
        return max;
    }
}