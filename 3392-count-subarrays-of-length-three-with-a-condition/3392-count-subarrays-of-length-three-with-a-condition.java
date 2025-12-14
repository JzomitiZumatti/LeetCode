class Solution {
    public int countSubarrays(int[] nums) {
        int counter = 0;
        for (int i = 2; i < nums.length; i++) {
            double first = nums[i - 2];
            double last = nums[i];
            double mid = nums[i - 1];
            if (mid / 2 == first + last) counter++;
        }
        return counter;
    }
}