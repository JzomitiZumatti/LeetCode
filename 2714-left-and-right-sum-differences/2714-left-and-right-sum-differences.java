class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int right = 0;
            int left = 0;
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    left += nums[j];
                }
            }
            if (i != nums.length - 1) {
                for (int j = nums.length - 1; j > i; j--) {
                    right += nums[j];
                }
            }
            arr[i] = Math.abs(left - right);
        }
        return arr;
    }
}