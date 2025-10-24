class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(j));
            if (i == word1.length() - 1 && j < word2.length() - 1) {
                j++;
                while (j < word2.length()) {
                    stringBuilder.append(word2.charAt(j));
                    j++;
                }
            }
            if (j == word2.length() - 1 && i < word1.length() - 1) {
                i++;
                while (i < word1.length()) {
                    stringBuilder.append(word1.charAt(i));
                    i++;
                }
            }
        }
        return stringBuilder.toString();
    }
}