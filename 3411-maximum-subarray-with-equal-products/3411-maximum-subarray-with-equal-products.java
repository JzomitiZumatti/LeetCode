class Solution {
    public int maxLength(int[] nums) {
        int length = 0;
        int left = 0;
        while (left < nums.length) {
            int right = left + 1;
            while (right <= nums.length) {
                int[] subArray = Arrays.copyOfRange(nums, left, right);
                long prod = prodCalc(subArray);
                long[] gcdLCM = findGcdAndLcm(subArray);
                if (prod == gcdLCM[0] * gcdLCM[1]) length = Math.max(length, right - left);
                right++;
            }
            left++;
        }
        return length;
    }

    private static long prodCalc(int[] nums) {
        long ans = 1L;
        for (int n : nums) {
            ans *= n;
        }
        return ans;
    }

    private static long[] findGcdAndLcm(int[] nums) {
        long currentGcd = Math.abs((long) nums[0]);
        long currentLcm = currentGcd;

        for (int i = 1; i < nums.length; i++) {
            long val = Math.abs((long) nums[i]);
            if (currentGcd != 1) {
                currentGcd = gcd(currentGcd, val);
            }
            if (currentLcm != 0) {
                currentLcm = (val == 0) ? 0 : (currentLcm / gcd(currentLcm, val)) * val;
            }
        }
        return new long[]{currentGcd, currentLcm};
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}