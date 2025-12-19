class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (hasZero(i)) {
                if (hasZero(n - i)) return new int[]{i, n - i};
            }
        }
        return new int[]{};
    }

    private static boolean hasZero(int n) {
        while (n / 10 != 0) {
            if (n % 10 == 0) return false;
            n /= 10;
        }
        return n != 0;
    }
}