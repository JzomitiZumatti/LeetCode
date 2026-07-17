class Solution {
    public int numPrimeArrangements(int n) {
        int MOD = 1_000_000_007;
        int primesN = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) primesN++;
        }
        return (int) ((factorial(primesN) % MOD) * (factorial(n - primesN)) % MOD) % MOD;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static long factorial(int n) {
        int MOD = 1_000_000_007;
        long ans = 1L;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % MOD;
        }
        return ans;
    }
}