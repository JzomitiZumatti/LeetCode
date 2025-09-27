class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (!isPalindrome(baseTransorm(n, i))) return false;
        }
        return true;
    }

    private static String baseTransorm(int n, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n / i != 0) {
            int temp = n % i;
            stringBuilder.append(temp);
            n = n / i;
        }
        stringBuilder.append(n);
        return stringBuilder.reverse().toString();
    }

    private static boolean isPalindrome(String n) {
        int left = 0;
        int right = n.length() - 1;
        while (left < right) {
            if (n.charAt(left) != n.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}