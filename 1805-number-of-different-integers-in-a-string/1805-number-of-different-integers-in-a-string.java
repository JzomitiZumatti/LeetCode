class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> un = new HashSet<>();
        int start = 0;
        int end = 0;
        boolean isStart = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!isStart && Character.isDigit(c)) {
                start = i;
                isStart = true;
            } else if (isStart && !Character.isDigit(c)) {
                end = i;
                isStart = false;
                un.add(removeTrailingZeros(word.substring(start, end)));
            }
        }
        if (isStart) {
            un.add(removeTrailingZeros(word.substring(start)));
        }
        return un.size();
    }

    private static String removeTrailingZeros(String s) {
        if (s == null || s.isEmpty()) {
            return "0";
        }

        int firstNonZero = 0;
        while (firstNonZero < s.length() && s.charAt(firstNonZero) == '0') {
            firstNonZero++;
        }

        if (firstNonZero == s.length()) {
            return "0";
        }

        return s.substring(firstNonZero);
    }
}