class Solution {
    public int findClosestNumber(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] < Math.abs(min)) {
                min = nums[i];
            }
            if (nums[i] > 0 && nums[i] == Math.abs(min)) {
                min = nums[i];
            }
            if (nums[i] < 0 && Math.abs(nums[i]) < Math.abs(min)) {
                min = nums[i];
            }
        }
        return min;
    }
}