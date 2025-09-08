class Solution {
    public int differenceOfSum(int[] nums) {
        int numbSum = 0;
        int dSum = 0;
        for (int n : nums) {
            numbSum += n;
            dSum += digitSum(n);
        }

        return Math.abs(numbSum - dSum);
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n / 10 != 0) {
            int temp = n % 10;
            sum += temp;
            n = n / 10;
        }
        sum += n;
        return sum;
    }
}