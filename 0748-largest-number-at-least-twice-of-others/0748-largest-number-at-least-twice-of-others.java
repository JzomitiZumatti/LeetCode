class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else {
                secondMax = Math.max(nums[i], secondMax);
            }
        }
        return secondMax * 2 <= max ? index : -1;
    }
}