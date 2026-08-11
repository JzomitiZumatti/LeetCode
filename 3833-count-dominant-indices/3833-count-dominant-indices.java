class Solution {
    public int dominantIndices(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int left = nums[i];
            double sum = 0.0;
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
            }
            if (left > sum / (nums.length - (i + 1))) ans++;
        }
        return ans;
    }
}