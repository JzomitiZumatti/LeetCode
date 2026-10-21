class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if (k > s.length()) return false;
        if (k == 1 && k == s.length()) return true;
        int counter = 1;
        if (checker(0, s, k)) return true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) counter++;
            else counter = 1;
            if (counter == k) {
                int pos = i + 1;
                if (checker(pos, s, k)) return true;
                counter = 1;
            }
        }
        return false;
    }

    private static boolean checker(int pos, String s, int k) {
        if (pos == k - 1 && pos == s.length() - 1) return true;
        else if (pos == k - 1 && pos < s.length() - 1) {
            if (s.charAt(pos) != s.charAt(pos + 1)) return true;
        } else if (pos - (k - 1) > 0 && pos == s.length() - 1) {
            if (s.charAt(pos) != s.charAt(pos - k)) return true;
        } else if (pos - (k - 1) > 0 && pos < s.length() - 1) {
            if (s.charAt(pos) != s.charAt(pos - k) &&
                    s.charAt(pos) != s.charAt(pos + 1)) return true;
        }
        return false;
    }
}