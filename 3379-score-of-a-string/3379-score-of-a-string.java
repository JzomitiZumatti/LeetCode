class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int l = s.charAt(i - 1);
            int r = s.charAt(i);
            sum += Math.abs(l - r);
        }
        return sum;
    }
}