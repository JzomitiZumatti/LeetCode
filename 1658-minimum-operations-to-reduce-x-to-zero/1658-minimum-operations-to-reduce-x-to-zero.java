class Solution {
    public int minOperations(int[] nums, int x) {
        int ans = -1;
        if (x == 0) return 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (x > sum) return ans;
        int left = 0;
        int right = 0;
        int temp = 0;
        while (right < nums.length) {
            temp += nums[right];
            if (temp > sum - x) {
                while (temp > sum - x) {
                    temp -= nums[left];
                    left++;
                }
            }
            if (temp == sum - x) {
                int res = nums.length - (right - left + 1);
                ans = ans == -1 ? res : Math.min(ans, res);
            }
            right++;
        }
        return ans;
    }
}