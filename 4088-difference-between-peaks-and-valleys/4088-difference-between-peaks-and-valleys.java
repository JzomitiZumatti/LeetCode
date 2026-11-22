class Solution {
    public int peakValleyDifference(int[] nums) {
        int peakSum = 0;
        int valSum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];
            int next = nums[i + 1];
            if (curr > prev && curr > next) peakSum += curr;
            if (curr < prev && curr < next) valSum += curr;
        }
        return peakSum - valSum;
    }
}