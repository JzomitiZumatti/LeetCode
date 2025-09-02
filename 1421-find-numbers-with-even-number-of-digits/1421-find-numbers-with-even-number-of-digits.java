class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int n : nums) {
            if (isEven(n)) res++;
        }
        return res;
    }

    private static boolean isEven(int n) {
        int counter = 1;
        while (n / 10 != 0) {
            n /= 10;
            counter++;
        }
        return counter % 2 == 0;
    }
}