class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = 0;
        int div = Integer.MAX_VALUE;
        for (int divisor : divisors) {
            int counter = 0;
            for (int n : nums) {
                if (n % divisor == 0) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                div = divisor;
            } else if (counter == max) {
                div = Math.min(div, divisor);
            }
        }
        return div;
    }
}