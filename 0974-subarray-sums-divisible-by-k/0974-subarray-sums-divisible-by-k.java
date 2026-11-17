class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        int[] freqRem = new int[k];
        freqRem[0 % 5]++;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            int rem = ((sum % k) + k) % k;
            freqRem[rem]++;
        }
        for (int f : freqRem) {
            ans += (f * (f - 1)) / 2;
        }
        return ans;
    }
}