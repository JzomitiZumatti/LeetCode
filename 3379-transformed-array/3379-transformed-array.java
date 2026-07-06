class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > 0) ans[i] = nums[((i + n) % nums.length + nums.length) % nums.length];
            else if (n < 0) ans[i] = nums[((i - Math.abs(n)) % nums.length + nums.length) % nums.length];
            else ans[i] = n;
        }
        return ans;
    }
}