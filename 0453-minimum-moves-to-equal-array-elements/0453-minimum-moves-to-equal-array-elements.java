class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            if (num > min) ans += (num - min);
        }
        return ans;
    }
}