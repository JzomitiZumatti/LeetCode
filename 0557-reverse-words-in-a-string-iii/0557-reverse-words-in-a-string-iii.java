class Solution {
    public String reverseWords(String s) {
        StringBuilder reverseSentence = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
                reverseSentence.append(rev.append(words[i]).reverse());
                reverseSentence.append(" ");
            } else {
                reverseSentence.append(rev.append(words[i]).reverse());
            }
            rev.setLength(0);
        }
        return reverseSentence.toString();
    }
}