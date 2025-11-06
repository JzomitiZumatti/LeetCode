class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max = 0;
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            numFreq.put(sum(i), numFreq.getOrDefault(sum(i), 0) + 1);
        }

        for (Integer value : numFreq.values()) {
            max = Math.max(max, value);
        }
        return max;
    }

    private static int sum(int n) {
        int sum = 0;
        while (n / 10 != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum + n;
    }
}