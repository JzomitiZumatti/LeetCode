class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.MIN_VALUE;
        int left = 0;
        int right = k - 1;
        double sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        max = sum / k;
        while (right < nums.length) {
            sum -= nums[left];
            left++;
            right++;
            if (right < nums.length) {
                sum += nums[right];
                max = Math.max(max, sum / k);
            }
            System.out.println(sum);
        }
        return max;
    }
}