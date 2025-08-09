class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < nums.length; i++) {
            sumLeft += i == 0 ? 0 : nums[i - 1];
            sumRight = totalSum - sumLeft - nums[i];
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }
}