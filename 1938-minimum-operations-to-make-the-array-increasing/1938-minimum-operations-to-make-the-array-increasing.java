class Solution {
    public int minOperations(int[] nums) {
        int counter = 0;
        if (nums.length == 1 ) return counter;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int cur = nums[i];
                while (cur <= nums[i - 1]) {
                    cur++;
                    counter++;
                }
                nums[i] = cur;
            }
        }
        return counter;
    }
}