class Fancy {
private static final int MOD = 1_000_000_007;
    private ArrayList<Long> list;
    private long mult = 1;
    private long add = 0;
    public Fancy() {
        this.list = new ArrayList<Long>();
    }

    public void append(int val) {
        long n = ((val - add + MOD) % MOD * modularExponentiation(mult, MOD-2, MOD)) % MOD;
        list.add(n);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mult = (mult * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= list.size()) return -1;
        else {
            long val = (list.get(idx) * mult) % MOD;
            val = (val + add) % MOD;
            return (int) val;
        }
    }

    public static long modularExponentiation(long base, long exponent, long modulus) {
        if (modulus == 1) return 0;
        long result = 1;
        base = base % modulus;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }

            exponent = exponent >> 1;

            base = (base * base) % modulus;
        }

        return result;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */