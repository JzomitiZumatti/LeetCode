class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPlaindrome(left + 1, right, s) || isPlaindrome(left, right - 1, s);
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isPlaindrome(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            else left++;
            right--;
        }
        return true;
    }
}