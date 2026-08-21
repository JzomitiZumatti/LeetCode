class Solution {
    public int largestInteger(int n, int s) {
        int max = (int) Math.pow(10, n) - 1;
        int ans = -1;
        for (int i = 0; i <= max; i++) {
            if (sumOfDigit(i) == s) ans = Math.max(ans, i);
        }
        return ans;
    }

    private static int sumOfDigit(int a) {
        int sum = 0;
        while (a / 10 != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum + a;
    }
}