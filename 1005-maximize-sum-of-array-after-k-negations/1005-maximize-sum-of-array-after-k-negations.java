class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        while (k > 0) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0) {
                    k = 0;
                    break;
                }
                if (nums[j] < 0) {
                    nums[j] *= -1;
                    k--;
                }
            
                if (k == 0) break;
            }

            if (k > 0) {
                Arrays.sort(nums);
                while (k > 0) {
                    nums[0] *= -1;
                    k--;
                }
            }
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}