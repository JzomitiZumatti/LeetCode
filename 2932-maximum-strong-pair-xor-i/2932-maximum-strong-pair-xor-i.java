class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int n1 = nums[i];
            for (int j = i; j < nums.length; j++) {
                int n2 = nums[j];
                if (Math.abs(n1 - n2) <= Math.min(n1, n2)) ans = Math.max(ans, n1 ^ n2);
            }
        }
        return ans;
    }
}