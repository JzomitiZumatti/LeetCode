class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxN = Integer.MIN_VALUE;
        int max = 0;
        for (int n : nums) {
            maxN = Math.max(maxN, n);
        }

        for (int i = 0; i < k; i++) {
            max += maxN + i;
        }
        return max;
    }
}