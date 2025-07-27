class Solution {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int counter = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
                if (isPrime[i]) {
                    int j = i * i;
                    while (j < n) {
                        isPrime[j] = false;
                        j += i;
                }
            }
        }

        for (boolean p : isPrime) {
            if (p) {
                counter++;
            }
        }

        return counter;
    }
}