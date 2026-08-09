class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ans = 101;
        for (int i = 0; i < nums.length; i++) {
            int n1 = nums[i];
            int j = i + 1;
            if (n1 == 1 || n1 == 2) {
                while (j < nums.length) {
                    int n2 = nums[j];
                    if (n1 == 1 && n2 == 2) ans = Math.min(ans, Math.abs(i - j));
                    if (n1 == 2 && n2 == 1) ans = Math.min(ans, Math.abs(i - j));
                    j++;
                }
            }
        }
        return ans != 101 ? ans : -1;
    }
}