class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans = new int[nums.length];
        int odd = 0;
        int even = 0;
        for (int num : nums) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[i] = odd;
                even--;
            } else {
                ans[i] = even;
                odd--;
            }
        }
        return ans;
    }
}