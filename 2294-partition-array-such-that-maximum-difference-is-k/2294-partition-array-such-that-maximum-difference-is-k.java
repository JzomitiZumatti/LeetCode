class Solution {
    public int partitionArray(int[] nums, int k) {
        if (nums.length == 1) return 1;
        int ans = 1;
        Arrays.sort(nums);
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - min > k) {
                min = nums[i];
                ans++;
            }
        }
        return ans;
    }
}