class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int oddCounter = 0;
        int evenCounter = 0;
        int i = 1;
        while (evenCounter < n && oddCounter < n) {
            if (i % 2 == 0) {
                evenSum += i;
                evenCounter++;
            }
            if (i % 2 != 0) {
                oddSum += i;
                oddCounter++;
            }
            i++;
        }
        return gcd(oddSum, evenSum);
    }

    private static int gcd(int a, int b) {
        int d = 1;
        int max = Math.max(a, b);
        for (int i = 1; i < max; i++) {
            if (a % i == 0 && b % i == 0) {
                d = Math.max(d, i);
            }
        }
        return d;
    }
}