class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            if (s >= k) return 1;
            int j = i + 1;
            int counter = 1;
            while (j < nums.length) {
                s |= nums[j];
                counter++;
                if (s >= k) ans = Math.min(ans, counter);
                j++;
            }
        }
        return ans < Integer.MAX_VALUE ? ans : -1;
    }
}