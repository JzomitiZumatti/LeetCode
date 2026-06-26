class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int first = String.valueOf(nums[i]).charAt(0) - '0';
                int last = String.valueOf(nums[j]).charAt(String.valueOf(nums[j]).length() - 1) - '0';
                if (gcd(first, last)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static boolean gcd(int a, int b) {
        int max = Math.max(a, b);
        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) return false;
        }
        return true;
    }
}