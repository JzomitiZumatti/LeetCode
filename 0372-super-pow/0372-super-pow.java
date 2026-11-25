class Solution {
    public int superPow(int a, int[] b) {
        int ans = 1;
        int mod = 1337;
        a = a % mod;

        for (int n : b) {
            ans = (int) ((pow(ans, 10, mod) * pow(a, n, mod)) % mod);
        }
        return ans;
    }

    private static long pow(long base, long exp, long mod) {
        if (mod == 1) return 0;
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}