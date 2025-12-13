class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> numberFreq = new HashMap<>();
        for (int num : nums) {
            numberFreq.put(num, numberFreq.getOrDefault(num, 0) + 1);
        }

        for (Integer value : numberFreq.values()) {
            if (isPrime(value)) return true;
        }
        return false;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}