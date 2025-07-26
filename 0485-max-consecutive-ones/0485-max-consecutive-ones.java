class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int n : nums) {
            if (n == 1) {
                counter++;
            } else {
                max = Math.max(max, counter);
                counter = 0;
            }
        }
        if (counter > 0) {
            max = Math.max(max, counter);
        }
        return max;
    }
}