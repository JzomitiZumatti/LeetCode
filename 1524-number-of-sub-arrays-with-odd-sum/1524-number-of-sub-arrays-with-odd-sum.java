class Solution {
    private static final int MOD = 1_000_000_007;

    public int numOfSubarrays(int[] arr) {
        int[] prefSum = new int[arr.length + 1];
        prefSum[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum[i + 1] = prefSum[i] + arr[i];
        }
        long ans = 0L;
        int even = 0;
        int odd = 0;
        for (int j : prefSum) {
            if (j % 2 != 0) {
                ans += even;
                odd++;
            } else {
                ans += odd;
                even++;
            }
        }
        return (int) (ans % MOD);
    }
}