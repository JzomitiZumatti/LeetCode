class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target && Math.abs(i - start) < min) {
                min = Math.min(min, Math.abs(i - start));
            }
            i++;
        }
        return min;
    }
}