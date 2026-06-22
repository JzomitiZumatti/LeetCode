class Solution {
    public int countValidWords(String sentence) {
        int ans = 0;
        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            if (isValidWord(word)) ans++;
        }
        return ans;
    }

    private static boolean isValidWord(String s) {
        int hypenCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) return false;
            if (Character.isUpperCase(s.charAt(i))) return false;
            if (s.charAt(i) == '-') {
                hypenCounter++;
                if (hypenCounter > 1) return false;
                if (i + 1 < s.length() && i - 1 >= 0 && (!Character.isAlphabetic(s.charAt(i + 1)) ||
                        !Character.isAlphabetic(s.charAt(i - 1)))) return false;
                else if (i + 1 >= s.length() || i - 1 < 0) return false;
            }
            if ((s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == '.') && i != s.length() - 1) return false;
        }
        return true;
    }
}