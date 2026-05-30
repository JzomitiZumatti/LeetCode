class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0] * nums[1] * nums[2];
        int sec = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int third = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(Math.max(first, sec), third);
    }
}