class Solution {
    public int concatenatedBinary(int n) {
        long MOD = 1_000_000_007;
        long res = 0;
        int bits = 1;
        for (int i = 1; i <= n; i++) {
            res = (res << bits) + i;
            if ((i + 1 & i) == 0) {
                bits++;
            }
            res %= MOD;
        }
        return (int) res;
    }
}