class Solution {
    public int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean isMountain = false;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] < nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] > nums[k]) {
                            min = Math.min(min, nums[i] + nums[j] + nums[k]);
                            isMountain = true;
                        }
                    }
                }
            }
        }
        return isMountain ? min : -1;
    }
}