class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        if (sum % k == 0) {
            return 0;
        } else {
            int temp = sum;
            while (temp % k != 0) {
                temp--;
            }
            return sum - temp;
        }
    }
}