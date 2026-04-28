class Solution {
    public int minPairSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int a = nums[left];
            int b = nums[right];
            ans = Math.max(ans, a + b);
            left++;
            right--;
        }
        return ans;
    }
}