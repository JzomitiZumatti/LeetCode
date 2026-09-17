class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int firstPart = 0;
        int secondPart = 0;
        int zeroCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n == 0) zeroCounter++;
            if (zeroCounter == 0 && n == 1) firstPart++;
            if (zeroCounter == 1 && n == 1) secondPart++;
            if (zeroCounter > 1) {
                if (secondPart == 0 && firstPart == nums.length) firstPart -= 1;
                max = Math.max(max, firstPart + secondPart);
                zeroCounter = 1;
                firstPart = secondPart;
                secondPart = 0;
            }
        }
        firstPart = secondPart == 0  && firstPart == nums.length ? firstPart - 1 : firstPart;
        max = Math.max(max, firstPart + secondPart);
        return max;
    }
}