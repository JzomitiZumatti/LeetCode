class Solution {
    public int countPrimeSetBits(int left, int right) {
        int counter = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(bitsCounter(i))) counter++;
        }
        return counter;
    }

    private static boolean isPrime(int n) {
        List<Integer> prime = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        Set<Integer> primes = new HashSet<>(prime);
        return primes.contains(n);
    }

    private static int bitsCounter(int n) {
        String bin = Integer.toBinaryString(n);
        int counter = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (Integer.parseInt(String.valueOf(bin.charAt(i))) == 1) counter++;
        }
        return counter;
    }
}