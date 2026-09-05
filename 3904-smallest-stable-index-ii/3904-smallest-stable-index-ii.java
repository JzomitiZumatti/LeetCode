class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums.length == 1) return 0;
        int[] minChart = new int[nums.length];
        int[] maxChart = new int[nums.length];
        minChart[nums.length - 1] = nums[nums.length - 1];
        maxChart[0] = nums[0];
        int min = minChart[minChart.length - 1];
        int max = maxChart[0];
        for (int i = nums.length - 2, j = 1; i >= 0 && j < nums.length; i--, j++) {
            if (nums[j] > max) {
                max = nums[j];
                maxChart[j] = max;
            } else maxChart[j] = max;
            if (nums[i] < min) {
                min = nums[i];
                minChart[i] = min;
            } else minChart[i] = min;
        }
        for (int i = 0; i < minChart.length; i++) {
            int diff = maxChart[i] - minChart[i];
            if (diff <= k) return i;
        }
        return -1;
    }
}