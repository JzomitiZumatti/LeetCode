class Solution {
    public boolean isSubstringPresent(String s) {
        for (int i = 1; i < s.length(); i++) {
            char[] left = new char[]{s.charAt(i - 1), s.charAt(i)};
            for (int j = s.length() - 1; j >= 1; j--) {
                char[] right = new char[]{s.charAt(j), s.charAt(j - 1)};
                if (Arrays.equals(left, right)) return true;
            }
        }
        return false;
    }
}