class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxInc = 1;
        int counterInc = 1;
        int maxDec = 1;
        int counterDec = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                counterInc++;
                maxDec = Math.max(maxDec, counterDec);
                counterDec = 1;
            } else if (nums[i] < nums[i - 1]) {
                counterDec++;
                maxInc = Math.max(maxInc, counterInc);
                counterInc = 1;
            } else {
                maxDec = Math.max(maxDec, counterDec);
                counterDec = 1;
                maxInc = Math.max(maxInc, counterInc);
                counterInc = 1;
            }
        }
        if (counterInc > 1) maxInc = Math.max(maxInc, counterInc);
        if (counterDec > 1) maxDec = Math.max(maxDec, counterDec);
        return Math.max(maxInc, maxDec);
    }
}