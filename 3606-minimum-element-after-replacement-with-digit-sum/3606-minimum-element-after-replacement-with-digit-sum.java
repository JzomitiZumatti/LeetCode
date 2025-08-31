class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            min = Math.min(min, sum(n));
        }
        return min;
    }

    private static int sum(int n) {
        int sum = 0;
        while (n / 10 != 0) {
            int temp = n % 10;
            sum += temp;
            n = n / 10;
        }
        sum += n;
        return sum;
    }
}