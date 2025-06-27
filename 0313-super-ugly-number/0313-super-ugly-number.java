class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        Set<Integer> uniqueUglies = new HashSet<>();
        int[] index = new int[primes.length];
        int[]uglies = new int[n];
        Arrays.fill(index, 0);
        uniqueUglies.add(1);
        uglies[0] = 1;
        int counter = 1;
        while (counter < n) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                long val = (long) uglies[index[j]] * primes[j];
                if (val < min) {
                    min = Math.toIntExact(val);
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
        System.out.println(Arrays.toString(uglies));
        return uglies[uglies.length - 1];
    }
}