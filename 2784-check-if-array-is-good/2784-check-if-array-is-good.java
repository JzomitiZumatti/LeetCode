class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        if (nums.length != max + 1 || nums[nums.length - 2] != max) return false;
        int[] cop = new int[nums.length];
        for (int i = 1; i <= max; i++) {
            cop[i - 1] = i;
        }
        cop[nums.length - 1] = max;
        return Arrays.equals(cop, nums);
    }
}