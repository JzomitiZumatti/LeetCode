class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int zeroCounter = 0;
        int oneCounter = 0;
        for (int num : nums) {
            if (num == 1) {
                oneCounter++;
                if (oneCounter > 1) {
                    if (zeroCounter < k) return false;
                    else zeroCounter = 0;
                }
            } else if (oneCounter > 0) zeroCounter++;

        }
        return true;
    }
}