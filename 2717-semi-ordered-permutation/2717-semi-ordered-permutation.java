class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minPos = -1;
        int maxPos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = Math.min(min, nums[i]);
                minPos = i;
            }
            if (nums[i] > max) {
                max = Math.max(max, nums[i]);
                maxPos = i;
            }
        }
        return minPos < maxPos ? minPos + (nums.length - maxPos - 1) : minPos + (nums.length - maxPos - 1) - 1;
    }
}