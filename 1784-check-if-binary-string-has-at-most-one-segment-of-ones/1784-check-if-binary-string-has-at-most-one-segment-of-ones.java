class Solution {
    public boolean checkOnesSegment(String s) {
        boolean isZero = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') isZero = true;
            if (isZero && c == '1') return false;
        }
        return true;
    }
}