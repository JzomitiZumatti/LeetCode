class Solution {
    public int numSquares(int n) {
        int[] numbers = new int[n + 1];
        Arrays.fill(numbers, Integer.MAX_VALUE);
        numbers[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                numbers[i] = Math.min(numbers[i], numbers[i - square] + 1);
            }
        }

        return numbers[n];
    }
}