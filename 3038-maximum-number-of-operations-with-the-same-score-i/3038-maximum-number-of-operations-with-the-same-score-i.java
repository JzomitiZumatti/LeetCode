class Solution {
    public int maxOperations(int[] nums) {
        int ans = 1;
        int i = 1;
        int score = nums[i - 1] + nums[i];
        i += 2;
        while (i < nums.length) {
            if (nums[i - 1] + nums[i] == score) {
                ans++;
                i += 2;
            } else break;
        }
        return ans;
    }
}