import java.math.BigInteger;
class Solution {
    public int distributeCandies(int n, int limit) {
        int k = 3;
        int m = limit;
        int upperIndex = n + k - 1;
        int bottomIndex = k - 1;
        BigInteger sum = factorial(upperIndex)
                .divide(factorial(bottomIndex).multiply(factorial(upperIndex - bottomIndex)));
        for (int i = 1; i <= k; i++) {
            upperIndex = n - i * (m + 1) + k - 1;
            int index = (int) Math.pow(-1, i + 1);
            BigInteger firstC = factorial(k).divide(factorial(i).multiply(factorial(k - i)));
            BigInteger secondC = upperIndex < 0 ? BigInteger.ZERO :
                    factorial(upperIndex).divide(factorial(bottomIndex).multiply(factorial(upperIndex - bottomIndex)));
            sum = sum.subtract(BigInteger.valueOf(index).multiply(firstC).multiply(secondC));
        }
        return sum.intValue();
    }

    private static BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}