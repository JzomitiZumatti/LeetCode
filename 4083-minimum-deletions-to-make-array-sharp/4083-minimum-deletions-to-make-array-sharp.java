class Solution {
    public int minDeletions(int[] nums) {
        int ans = 0;
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] ^ a) == 0) ans++;
            else a = nums[i];
        }
        return ans;
    }
}