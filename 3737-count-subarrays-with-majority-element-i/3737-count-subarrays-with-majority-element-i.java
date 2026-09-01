class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            if (nums[i] == target) {
                counter++;
                ans++;
            }
            if (i < nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target) counter++;
                    if (2 * counter > j - i + 1) ans++;
                }
            }
        }
        return ans;
    }
}