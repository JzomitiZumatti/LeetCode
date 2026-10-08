class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            int rot = Math.min(Math.abs(current - n), s.length() - Math.abs(current - n));
            ans += rot;
            current = n;
        }
        return ans;
    }
}