class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int vovels = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vovels++;
            }
        }
        return vovels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}