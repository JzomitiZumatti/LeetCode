class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int i = 0;
        while (i < k) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = nums[minIndex] * multiplier;
            i++;
        }
        return nums;
    }
}