class Solution {
    public int sortPermutation(int[] nums) {
        int ans = 0;
        boolean first = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (first) {
                    ans = nums[i];
                    first = false;
                }
                else ans &= nums[i];
            }
        }
        return ans;
    }
}