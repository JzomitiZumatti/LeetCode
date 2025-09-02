class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sum(nums[i])) {
                return i;
            }
        }
        return -1;
    }

    private static int sum(int n) {
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