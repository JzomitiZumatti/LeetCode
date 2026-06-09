class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        if (s.length() == 2) {
            return Math.abs(s.charAt(0) - s.charAt(1)) <= 2;
        }
        for (int i = 2; i < s.length(); i++) {
            int a = s.charAt(i - 2) - '0';
            int b = s.charAt(i - 1) - '0';
            int c = s.charAt(i) - '0';
            int ab = Math.abs(a - b);
            int bc = Math.abs(b - c);
            if (ab > 2 || bc > 2) return false;
        }
        return true;
    }
}