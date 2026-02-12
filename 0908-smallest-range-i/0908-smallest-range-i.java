class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int j = 0;
        while (j <= k) {
            int minTemp = min + j;
            int maxTemp = max - j;
            if (minTemp > maxTemp || minTemp == maxTemp) return 0;
            j++;
        }
        return (max - k) - (min + k);
    }
}