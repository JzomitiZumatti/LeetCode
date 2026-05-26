class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j < k || nums[j - k] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return Arrays.copyOf(nums, j);
    }
}