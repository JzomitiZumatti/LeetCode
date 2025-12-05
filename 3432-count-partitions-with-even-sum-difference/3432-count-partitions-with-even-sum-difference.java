class Solution {
    public int countPartitions(int[] nums) {
        int res = 0;
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = left; i < right; i++) {
                leftSum += nums[i];
            }
            for (int i = right; i < nums.length; i++) {
                rightSum += nums[i];
            }
            int gS = leftSum - rightSum;
            if (gS % 2 == 0) res++;
            right++;
        }
        return res;
    }
}