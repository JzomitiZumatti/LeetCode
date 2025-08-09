class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
            sumLeft[i] = i > 0 ? nums[i - 1] + sumLeft[i - 1] : 0;
            sumRight[j] = j < nums.length - 1 ? nums[j + 1] + sumRight[j + 1] : 0;
        }
        for (int i = 0; i < sumRight.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }
}