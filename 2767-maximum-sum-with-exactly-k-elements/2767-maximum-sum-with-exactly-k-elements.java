class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[nums.length - 1] + i;
        }
        return max;
    }
}