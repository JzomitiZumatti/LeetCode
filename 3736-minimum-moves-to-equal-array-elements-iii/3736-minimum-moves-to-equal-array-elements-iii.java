class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        for (int num : nums) {
           ans += (max - num);
        }
        return ans;
    }
}