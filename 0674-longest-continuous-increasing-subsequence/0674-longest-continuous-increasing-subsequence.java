class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxSeries = 1;
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                counter += 1;
            } else {
                maxSeries = Math.max(maxSeries, counter);
                counter = 1;
            }
        }
        return Math.max(maxSeries, counter);
    }
}