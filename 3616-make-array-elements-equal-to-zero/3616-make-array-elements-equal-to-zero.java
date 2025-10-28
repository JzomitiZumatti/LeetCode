class Solution {
    public int countValidSelections(int[] nums) {
        int res = 0;
        int[] prefixSum = new int[nums.length];

        if (nums.length > 0) {
            prefixSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
        }

        int[] suffixSum = new int[nums.length];

        if (nums.length > 0) {
            suffixSum[nums.length - 1] = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                suffixSum[i] = suffixSum[i + 1] + nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (prefixSum[i] == suffixSum[i]) res += 2;
                if (Math.abs(prefixSum[i] - suffixSum[i]) == 1) res += 1;
            }
        }
        return res;
    }
}