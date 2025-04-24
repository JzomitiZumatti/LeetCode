class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int next = (i + 1 < nums.length) ? nums[i + 1] : Integer.MAX_VALUE;
            if (nums[i] == target) {
                result = i;
            } else if (current < target && target < next && nums[i] != target) {
                result = i + 1;
            }
        }
        return result;
    }
}