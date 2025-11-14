class Solution {
    public boolean findSubarrays(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i - 1];
            for (int j = i + 1; j < nums.length; j++) {
                int sSum = nums[j] + nums[j - 1];
                if (sum == sSum) return true;
            }
        }
        return false;
    }
}