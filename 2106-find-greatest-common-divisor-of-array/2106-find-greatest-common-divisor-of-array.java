class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int res = -1;

        for (int i = 1; i <= max; i++) {
            if (min % i == 0 && max % i == 0) {
                res = Math.max(res, i);
            }
        }

        return res;
    }
}