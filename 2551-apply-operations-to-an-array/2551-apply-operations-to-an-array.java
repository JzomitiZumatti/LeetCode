class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i - 1] = nums[i] * 2;
                nums[i] = 0;
            }
        }
        int[] res = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                res[j] = num;
                j++;
            }
        }

        for (int i = j + 1; i < res.length; i++) {
            res[i] = 0;
        }
        return res;
    }
}