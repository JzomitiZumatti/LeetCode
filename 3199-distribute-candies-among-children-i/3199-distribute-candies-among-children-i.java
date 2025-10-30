class Solution {
    public int distributeCandies(int n, int limit) {
        int counter = 0;
        for (int i = 0; i <= Math.min(n, limit); i++) {
            for (int j = 0; j <= Math.min(n - i, limit); j++) {
                int x3 = n - i - j;
                if (x3 >= 0 && x3 <= limit) counter++;
            }
        }
        return counter;
    }

    private static long factorial(int n) {
        if (n == 0) return 1;
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}