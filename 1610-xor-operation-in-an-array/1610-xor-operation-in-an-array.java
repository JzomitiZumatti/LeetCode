class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];

        int j = 0;
        while (j < n) {
            nums[j] = start + 2 * j;
            j++;
        }

        int bitWiseScore = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bitWiseScore ^= nums[i];
        }

        return bitWiseScore;
    }
}