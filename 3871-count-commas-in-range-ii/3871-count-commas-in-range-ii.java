class Solution {
    public long countCommas(long n) {
        long ans = 0;
        String num = String.valueOf(n);
        if (num.length() < 4) return ans;
        else {
            int ma = num.length() / 3;
            int part = num.length() % 3;
            int depth = part > 0 ? ma : ma - 1;
            for (int i = depth; i >= 0; i--) {
                long f = (long) (n - Math.pow(10, 3 * i) + 1);
                n = n - f;
                ans += f * i;
            }
        }
        return ans;
    }
}