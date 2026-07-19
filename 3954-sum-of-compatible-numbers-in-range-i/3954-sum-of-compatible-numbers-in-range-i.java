class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int ans = 0;
        int start = Math.max(1, n - k);
        for (int i = start; i <= n + k; i++) {
            if (Math.abs(n - i) <= k && (n & i) == 0) ans += i;
        }
        return ans;
    }
}