class Solution {
    public int minMoves2(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int avg = nums.length % 2 != 0 ? nums[nums.length / 2] : (nums[(nums.length / 2) - 1] + nums[nums.length / 2]) / 2;
        for (int num : nums) {
            if (num < avg) ans += (avg - num);
            else ans += (num - avg);
        }
        return ans;
    }
}