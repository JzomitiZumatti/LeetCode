class Solution {
    public int maximumValue(String[] strs) {
        int max = -1;
        for (String s : strs) {
            if (containsOnlyDigits(s)) {
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }
        }
        return max;
    }

    private static boolean containsOnlyDigits(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}