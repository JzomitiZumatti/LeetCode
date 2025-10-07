class Solution {
    public int findMaxK(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 0) {
                    max = Math.max(max, Math.abs(nums[i]));
                }
            }
        }
        return max < 0 ? -1 : max;
    }
}