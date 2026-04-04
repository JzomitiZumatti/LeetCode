class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int neg = 0;
        int pos = 0;
        int i = 0;
        while (i < nums.length) {
            if (i == 0 ||ans[i - 1] < 0) {
                while (nums[pos] < 0) {
                    pos++;
                }
                ans[i] = nums[pos];
                pos++;
            } else {
                while (nums[neg] >= 0) {
                    neg++;
                }
                ans[i] = nums[neg];
                neg++;
            }
            i++;
        }
        return ans;
    }
}