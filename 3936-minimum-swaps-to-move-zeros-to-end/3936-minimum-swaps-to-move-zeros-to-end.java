class Solution {
    public int minimumSwaps(int[] nums) {
        int zeroCounter = 0;
        for (int num : nums) {
            if (num == 0) zeroCounter++;
        }
        int ans = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0 && zeroCounter > 0) {
                ans++;
                zeroCounter--;
            } else if (nums[i] == 0 && zeroCounter > 0) zeroCounter--;
            if (zeroCounter == 0) break;
        }
        return ans;
    }
}