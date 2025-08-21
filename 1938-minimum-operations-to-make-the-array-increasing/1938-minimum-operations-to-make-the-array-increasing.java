class Solution {
    public int minOperations(int[] nums) {
        int counter = 0;
        if (nums.length == 1 ) return counter;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                counter += (nums[i - 1] + 1) - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        return counter;
    }
}