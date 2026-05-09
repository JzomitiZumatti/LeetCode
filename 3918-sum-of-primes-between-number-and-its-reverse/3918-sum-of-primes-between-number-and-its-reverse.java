class Solution {
    public int sumOfPrimesInRange(int n) {
        int ans = 0;
        int min = Math.min(n, reverseNum(n));
        int max = Math.max(n, reverseNum(n));
        for (int i = min; i <= max; i++) {
            if (isPrimary(i)) ans += i;
        }
        return ans;
    }

    private static int reverseNum(int n) {
        int ans = 0;
        while (n != 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n /= 10;
        }
        return ans;
    }

    private static boolean isPrimary(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}