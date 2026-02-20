class Solution {
    public int minOperations(int[] nums, int k) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        if (x == k) return 0;
        return Integer.bitCount(x ^ k);
    }
}