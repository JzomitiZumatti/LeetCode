class Solution {
    public boolean makeEqual(String[] words) {
        int[] lettersFreq = new int[26];
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                lettersFreq[c - 'a']++;
            }
        }
        for (int f : lettersFreq) {
            if (f > 0 && f % words.length != 0) return false;
        }
        return true;
    }
}