class Solution {
    public boolean detectCapitalUse(String word) {
        boolean first = isUpperLetter(word.charAt(0));
        if (!first) {
            for (int i = 1; i < word.length(); i++) {
                if (isUpperLetter(word.charAt(i))) return false;
            }
        } else {
            if (word.length() >= 2) {
                if (isUpperLetter(word.charAt(1))) {
                    for (int i = 1; i < word.length(); i++) {
                        if (!isUpperLetter(word.charAt(i))) return false;
                    }
                } else {
                    for (int i = 1; i < word.length(); i++) {
                        if (isUpperLetter(word.charAt(i))) return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isUpperLetter(char c) {
        return c >= 65 && c <= 90;
    }
}