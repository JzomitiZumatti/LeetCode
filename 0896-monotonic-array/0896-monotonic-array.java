class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean up = false;
        boolean down = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = true;
                if (down) return false;
            }
            if (nums[i] < nums[i - 1]) {
                down = true;
                if (up) return false;
            }
        }
        return true;
    }
}