class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = {2, 3, 5};
        int[] index = new int[primes.length];
        int[] uglies = new int[n];
        Arrays.fill(index, 0);
        uglies[0] = 1;
        int counter = 1;
        while (counter < n) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                int val = uglies[index[j]] * primes[j];
                if (val < min) {
                    min = val;
                }
            }
            uglies[counter] = min;
            counter++;
            for (int i = 0; i < primes.length; i++) {
                if (uglies[index[i]] * primes[i] == min) {
                    index[i]++;
                }
            }
        }
        return uglies[uglies.length - 1];
    }
}