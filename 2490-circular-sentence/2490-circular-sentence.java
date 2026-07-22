class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.trim().split("\\P{L}+");
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) return false;
        }
        return words[0].charAt(0) == words[words.length - 1].charAt(words[words.length - 1].length() - 1);
    }
}