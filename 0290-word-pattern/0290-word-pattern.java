class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charString = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!charString.containsKey(c) && !uniqueWords.contains(words[i])) {
                charString.put(c, words[i]);
                uniqueWords.add(words[i]);
            } else if (!charString.containsKey(c) && uniqueWords.contains(words[i])) {
                return false;
            } else if (!charString.get(c).equals(words[i])) {
                return false;
            }
        }
        return true;
    }
}