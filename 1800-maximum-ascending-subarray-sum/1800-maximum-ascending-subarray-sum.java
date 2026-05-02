class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int prev = nums[0];
        int curr = prev;
        for (int i = 1; i < nums.length; i++) {
            if (prev < nums[i]) {
                curr += nums[i];
            } else {
                max = Math.max(max, curr);
                curr = nums[i];
            }
            prev = nums[i];
        }
        return Math.max(max, curr);
    }
}