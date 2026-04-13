class Solution {
    public int minLengthAfterRemovals(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') a++;
            else b++;
        }
        return Math.abs(a - b);
    }
}