class Solution {
    public String longestPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length()) {
                char l = s.charAt(left);
                char r = s.charAt(right);
                if (l == r) {
                    left--;
                    right++;
                } else break;
            }

            if (right - left - 1 > max) {
                max = right - left - 1;
                res.setLength(0);
                res.append(s, left + 1, right);
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length()) {
                char l = s.charAt(left);
                char r = s.charAt(right);
                if (l == r) {
                    left--;
                    right++;
                } else break;
            }
            if (right - left - 1 > max) {
                max = right - left - 1;
                res.setLength(0);
                res.append(s, left + 1, right);
            }
        }
        return !res.isEmpty() ? res.toString() : String.valueOf(s.charAt(0));
    }
}