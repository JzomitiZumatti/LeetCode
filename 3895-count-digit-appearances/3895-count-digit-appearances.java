class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : nums) {
            stringBuilder.append(num);
        }
        char[] numbers = stringBuilder.toString().toCharArray();
        for (char number : numbers) {
            int n = Character.getNumericValue(number);
            if (n == digit) ans++;
        }
        return ans;
    }
}