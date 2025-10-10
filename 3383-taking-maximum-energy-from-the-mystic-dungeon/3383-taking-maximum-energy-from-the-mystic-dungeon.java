class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] dp = new int[energy.length];
        int max = Integer.MIN_VALUE;
        for (int i = energy.length - 1; i >= 0; i--) {
            int jumper = i + k;
            dp[i] = jumper >= dp.length ? energy[i] : energy[i] + dp[jumper];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}