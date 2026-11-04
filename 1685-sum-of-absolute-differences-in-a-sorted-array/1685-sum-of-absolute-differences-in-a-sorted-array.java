class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        int[] pref = new int[nums.length];
        int[] suf = new int[nums.length];
        pref[0] = nums[0];
        suf[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--) {
            pref[i] = pref[i - 1] + nums[i];
            suf[j] = suf[j + 1] + nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            int m = nums[i] * i - pref[i];
            int mm = suf[i] - (nums[i] * (nums.length - i - 1));
            ans[i] = m + mm;
        }
        return ans;
    }
}