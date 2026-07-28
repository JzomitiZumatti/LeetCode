class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int i = 0;
        while (i < nums.length) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
            }
            if (max - min <= k) return i;
            i++;
        }
        return -1;
    }
}