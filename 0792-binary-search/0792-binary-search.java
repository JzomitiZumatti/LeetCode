class Solution {
    public int search(int[] nums, int target) {
        int result = -2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            }
        }
        return result != -2 ? result : -1;
    }
}