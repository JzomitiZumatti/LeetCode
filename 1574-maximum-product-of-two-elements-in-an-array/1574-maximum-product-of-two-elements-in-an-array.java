class Solution {
    public int maxProduct(int[] nums) {
        int maxLeft = Integer.MIN_VALUE;
        int maxLeftIndex = -1;
        int maxRight = Integer.MIN_VALUE;
        int maxRightIndex = -1;
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
            if (maxLeft < nums[i] && i != maxRightIndex) {
                maxLeft = nums[i];
                maxLeftIndex = i;
            }
            if (maxRight < nums[j] && j != maxLeftIndex) {
                maxRight = nums[j];
                maxRightIndex = j;
            }
        }
        return (maxLeft - 1) * (maxRight - 1);
    }
}