class Solution {
    public int nthUglyNumber(int n) {
        Set<Integer> uniqueUglies = new HashSet<>();
        int[] primes = {2, 3, 5};
        int[] index = new int[primes.length];
        int[]uglies = new int[n];
        Arrays.fill(index, 0);
        uniqueUglies.add(1);
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
            if (!uniqueUglies.contains(min)) {
                uglies[counter] = min;
                uniqueUglies.add(min);
                counter++;
            }
            for (int i = 0; i < primes.length; i++) {
                if (uglies[index[i]] * primes[i] == min) {
                    index[i]++;
                }
            }
        }
        return uglies[uglies.length - 1];
    }
}