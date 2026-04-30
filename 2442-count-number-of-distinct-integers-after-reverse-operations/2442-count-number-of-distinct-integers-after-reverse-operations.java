class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (int num : nums) {
            ans.add(num);
            int reverse = reverseNUmber(num);
            ans.add(reverse);
        }
        return ans.size();
    }

    private static int reverseNUmber(int n) {
        long ans = 0;
        while (n != 0) {
            ans = ans * 10 + (n % 10);
            n /= 10;
        }

        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) ans;
    }
}