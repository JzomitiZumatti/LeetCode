class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            Arrays.sort(nums);
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) left++;
                else if (sum > target) right--;
                else return sum;
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}