class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int extra = 0;
        for (int num : nums) {
            ans = (ans ^ num) & ~extra;
            extra = (extra ^ num) & ~ans;
        }
        return ans;
    }
}