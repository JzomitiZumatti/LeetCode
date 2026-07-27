class Solution {
    public int digitFrequencyScore(int n) {
        int[] digitFreq = new int[10];
        while (n / 10 > 0) {
            digitFreq[n % 10]++;
            n /= 10;
        }
        digitFreq[n]++;
        int ans = 0;
        for (int i = 0; i < digitFreq.length; i++) {
            ans += i * digitFreq[i];
        }
        return ans;
    }
}