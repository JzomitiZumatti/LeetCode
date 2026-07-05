class Solution {
    public boolean checkGoodInteger(int n) {
        int[] ans = digitAndSquareSum(n);
        return ans[1] - ans[0] >= 50;
    }

    private static int[] digitAndSquareSum(int n) {
        int[] ans = new int[2];
        int digitSum = 0;
        int squareSum = 0;
        while (n / 10 != 0) {
            int temp = n % 10;
            squareSum += (temp * temp);
            digitSum += temp;
            n /= 10;
        }
        digitSum += n;
        squareSum += (n * n);
        ans[0] = digitSum;
        ans[1] = squareSum;
        return ans;
    }
}