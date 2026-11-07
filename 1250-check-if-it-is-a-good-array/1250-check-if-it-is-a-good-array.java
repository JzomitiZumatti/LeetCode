class Solution {
    public boolean isGoodArray(int[] nums) {
        if (nums[0] == 1) return true;
        else if (nums.length > 1) {
            int prev = gcd(nums[0], nums[1]);
            if (prev == 1) return true;
            for (int i = 2; i < nums.length; i++) {
                int curr = gcd(prev, nums[i]);
                if (curr == 1) return true;
                else prev = curr;
            }
        }
        return false;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}