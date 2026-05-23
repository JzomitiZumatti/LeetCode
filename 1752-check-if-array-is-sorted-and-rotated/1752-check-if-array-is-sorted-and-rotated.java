class Solution {
    public boolean check(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) p++;
            if (p >= 2) return false;
        }
        return p != 1 || nums[nums.length - 1] <= nums[0];
    }
}