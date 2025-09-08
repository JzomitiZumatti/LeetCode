class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (bitSum(i) == k) {
                res += nums.get(i);
            }
        }
        return res;
    }

    private static int bitSum(int n) {
        int sum = 0;
        while (n / 2 != 0) {
            int temp = n % 2;
            sum += temp;
            n = n / 2;
        }
        sum += n;
        return sum;
    }
}