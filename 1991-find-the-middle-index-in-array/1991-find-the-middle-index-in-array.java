class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefSum = new int[nums.length + 1];
        prefSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            prefSum[i + 1] = prefSum[i + 1 - 1] + nums[i];
        }
        int i = 0;
        while (i < nums.length) {
            if (prefSum[i + 1 - 1] == prefSum[prefSum.length - 1] - prefSum[i + 1 - 1] - nums[i]) return i;
            i++;
        }
        return -1;
    }
}