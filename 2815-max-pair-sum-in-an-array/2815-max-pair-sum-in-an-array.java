class Solution {
    public int maxSum(int[] nums) {
        int maxSum = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int iMax = maxNumber(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                int jMax = maxNumber(nums[j]);
                if (iMax == jMax) maxSum = Math.max(maxSum, nums[i] + nums[j]);
            }
        }
        return maxSum;
    }

    private static int maxNumber(int n) {
        int max = -1;
        while (n / 10 != 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }
        return Math.max(max, n);
    }
}