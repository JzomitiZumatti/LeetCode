class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (n > nums[0]) {
                ans += (n - nums[0]);
            }
        }
        return ans;
    }
}